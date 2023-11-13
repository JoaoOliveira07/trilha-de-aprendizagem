package barriga.domain.infra;

import org.junit.jupiter.api.*;
import trilha.testsjunit.barriga.domain.Usuario;
import trilha.testsjunit.barriga.domain.exceptions.ValidationException;
import trilha.testsjunit.barriga.domain.infra.UsuarioMemoryRepository;
import trilha.testsjunit.barriga.domain.service.UsuarioService;

import static trilha.testsjunit.barriga.domain.builders.UsuarioBuilder.umUsuario;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserServiceComUserMemoryRepositoryTest {
    private static UsuarioService service = new UsuarioService(new UsuarioMemoryRepository());

    @Test
    @Order(1)
    public void deveSalvarUsuarioValido() {
        Usuario user = service.salvar(umUsuario().comId(null).agora());
        Assertions.assertNotNull(user.getId());
    }

    @Test
    @Order(3)
    public void deveRejeitarUsuarioExistente() {
        ValidationException ex = Assertions.assertThrows(ValidationException.class, () ->
                service.salvar(umUsuario().comId(null).agora()));
        Assertions.assertEquals("Usuário user1@gmail.com já cadastrado!", ex.getMessage());
    }
}
