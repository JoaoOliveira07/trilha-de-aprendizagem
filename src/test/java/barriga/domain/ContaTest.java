package barriga.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import trilha.testsjunit.barriga.domain.Conta;
import trilha.testsjunit.barriga.domain.Usuario;
import trilha.testsjunit.barriga.domain.exceptions.ValidationException;

import java.util.stream.Stream;

import static trilha.testsjunit.barriga.domain.builders.ContaBuilder.umaConta;
import static trilha.testsjunit.barriga.domain.builders.UsuarioBuilder.umUsuario;


public class ContaTest {

    @Test
    public void deveCriarContaValida() {
        //Criar uma conta
        Conta conta = umaConta().agora();
        System.out.println(conta.usuario().getNome());
        System.out.println(umUsuario().agora().getNome());

        //Assertivas em cima da conta
        Assertions.assertAll("Conta",
                () -> Assertions.assertEquals(1L, conta.id()),
                () -> Assertions.assertEquals("Conta Válida", conta.nome()),
                () -> Assertions.assertEquals(umUsuario().agora(), conta.usuario())
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    public void deveRejeitarContaInvalida(Long id, String nome, Usuario usuario, String mensagem){
        String erroMessage = Assertions.assertThrows(ValidationException.class, () ->
                umaConta().comId(id).comNome(nome).comUsuario(usuario).agora()).getMessage();
        Assertions.assertEquals(mensagem, erroMessage);
    }

    private static Stream<Arguments> dataProvider(){
        return Stream.of(
                Arguments.of(1L, null, umUsuario().agora(), "Nome é obrigatório!"),
                Arguments.of(1L, "Conta Válida", null, "Usuário é obrigatório!")
        );
    }
}
