package trilha.testsjunit.barriga.domain.service.repository;


import trilha.testsjunit.barriga.domain.Usuario;

import java.util.Optional;

public interface UsuarioRepository {
    Usuario salvar(Usuario usuario);

    Optional<Usuario> getUserByEmail(String email);
}
