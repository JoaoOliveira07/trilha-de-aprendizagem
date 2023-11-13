package barriga.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import trilha.testsjunit.barriga.domain.Usuario;
import trilha.testsjunit.barriga.domain.exceptions.ValidationException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static trilha.testsjunit.barriga.domain.builders.UsuarioBuilder.umUsuario;


public class UsuarioTest {

    @Test
    public void deveCriarUsuarioValido() {
        Usuario usuario = umUsuario().agora();
        Assertions.assertAll("Usuario",
                () -> assertEquals(1L, usuario.getId()),
                () -> assertEquals("Usuário Válido", usuario.getNome()),
                () -> assertEquals("user1@gmail.com", usuario.getEmail()),
                () -> assertEquals("12345678", usuario.getSenha())
        );
    }

    @Test
    public void deveRejeitarUsuarioSemNome() {
        ValidationException ex = Assertions.assertThrows(ValidationException.class, () ->
               umUsuario().comNome(null).agora());
        assertEquals("Nome é obrigatório", ex.getMessage());
    }

    @Test
    public void deveRejeitarUsuarioSemEmail() {
        ValidationException ex = Assertions.assertThrows(ValidationException.class, () ->
                umUsuario().comEmail(null).agora());
        assertEquals("Email é obrigatório", ex.getMessage());
    }

    @Test
    public void deveRejeitarUsuarioSemSenha() {
        ValidationException ex = Assertions.assertThrows(ValidationException.class, () ->
                umUsuario().comSenha(null).agora());
        assertEquals("Senha é obrigatório", ex.getMessage());
    }

    @ParameterizedTest(name = "{4}")
    @CsvFileSource(files = "src/main/resources/camposObrigatorios.csv", nullValues = "NULL", numLinesToSkip = 1)
    public void deveRejeitarCampoObrigatorioNulo(Long id, String nome, String email, String senha, String mensagem){
        ValidationException ex = Assertions.assertThrows(ValidationException.class, () ->
                umUsuario().comId(id).comNome(nome).comEmail(email).comSenha(senha).agora());
        assertEquals(mensagem, ex.getMessage());
    }
}
