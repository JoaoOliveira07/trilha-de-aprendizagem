package barriga.service;

import static barriga.domain.builders.ContaBuilder.umaConta;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import trilha.testsjunit.barriga.domain.Conta;
import trilha.testsjunit.barriga.domain.exceptions.ValidationException;
import trilha.testsjunit.barriga.service.ContaService;
import trilha.testsjunit.barriga.service.external.ContaEvent;
import trilha.testsjunit.barriga.service.repository.ContaRepository;

@Tag("service")
@Tag("conta")
@ExtendWith(MockitoExtension.class)
//@MockitoSettings(strictness = Strictness.LENIENT)
public class ContaServiceTest {
    @InjectMocks private ContaService service;
    @Mock private ContaRepository repository;
    @Mock private ContaEvent event;

    @Captor private ArgumentCaptor<Conta> contaCaptor;

    @Test
    public void deveSalvarPrimeiraContaComSucesso() throws Exception {
        Conta contaToSave = umaConta().comId(null).agora();
        when(repository.salvar(Mockito.any(Conta.class))).thenReturn(umaConta().agora());
        Mockito.doNothing().when(event).dispatch(umaConta().agora(), ContaEvent.EventType.CREATED);

        Conta savedConta = service.salvar(contaToSave);
        Assertions.assertNotNull(savedConta.id());

        Mockito.verify(repository).salvar(contaCaptor.capture());
        Assertions.assertNull(contaCaptor.getValue().id());
        Assertions.assertTrue(contaCaptor.getValue().nome().startsWith("Conta Válida"));
    }

    @Test
    public void deveSalvarSegundaContaComSucesso() {
        Conta contaToSave = umaConta().comId(null).agora();
        when(repository.obterContasPorUsuario(contaToSave.usuario().getId()))
                .thenReturn(Arrays.asList(umaConta().comNome("Outra conta").agora()));
        when(repository.salvar(Mockito.any(Conta.class))).thenReturn(umaConta().agora());

        Conta savedConta = service.salvar(contaToSave);
        Assertions.assertNotNull(savedConta.id());
    }

    @Test
    public void deveRejeitarContaRepetida() {
        Conta contaToSave = umaConta().comId(null).agora();
        when(repository.obterContasPorUsuario(contaToSave.usuario().getId()))
                .thenReturn(Arrays.asList(umaConta().agora()));
//		when(repository.salvar(contaToSave)).thenReturn(umaConta().agora());

        String mensagem = Assertions.assertThrows(ValidationException.class, () ->
                service.salvar(contaToSave)).getMessage();
        Assertions.assertEquals("Usuário já possui uma conta com este nome", mensagem);
    }

    @Test
    public void naoDeveManterContaSemEvento() throws Exception {
        Conta contaToSave = umaConta().comId(null).agora();
        Conta contaSalva = umaConta().agora();
        when(repository.salvar(Mockito.any(Conta.class))).thenReturn(contaSalva);
        Mockito.doThrow(new Exception("Falha catrastrófica"))
                .when(event).dispatch(contaSalva, ContaEvent.EventType.CREATED);

        String mensagem = Assertions.assertThrows(Exception.class, () ->
                service.salvar(contaToSave)).getMessage();
        Assertions.assertEquals("Falha na criação da conta, tente novamente", mensagem);

        Mockito.verify(repository).delete(contaSalva);
    }
}