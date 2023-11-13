package barriga.domain.infra;

import trilha.testsjunit.barriga.domain.Usuario;
import trilha.testsjunit.barriga.domain.service.repository.UsuarioRepository;

import java.util.Optional;

import static trilha.testsjunit.barriga.domain.builders.UsuarioBuilder.umUsuario;


public class UsuarioDummyRepository implements UsuarioRepository {
    @Override
    public Usuario salvar(Usuario usuario) {
        return umUsuario()
                .comNome(usuario.getNome())
                .comEmail(usuario.getEmail())
                .comSenha(usuario.getSenha())
                .agora();
    }


    @Override
    public Optional<Usuario> getUserByEmail(String email) {
        if ("user1@gmail.com".equals(email))
            return Optional.of(umUsuario().comEmail(email).agora());
        return Optional.empty();
    }
}
