package barriga.domain.service;

import barriga.domain.infra.UsuarioDummyRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import trilha.testsjunit.barriga.domain.Usuario;
import trilha.testsjunit.barriga.domain.builders.UsuarioBuilder;
import trilha.testsjunit.barriga.domain.service.UsuarioService;

public class UsuarioServiceTest {
    private UsuarioService service;

    @Test
    public void deveSalvarUsuarioComSucesso(){
        service = new UsuarioService(new UsuarioDummyRepository());
        Usuario user = UsuarioBuilder.umUsuario().comId(null).comEmail("sadas@asdfa.com ").agora();
        Usuario saverUser = service.salvar(user);
        Assertions.assertNotNull(saverUser.getId());
    }
}
