package trilha.testsjunit.barriga.domain.service;

import trilha.testsjunit.barriga.domain.Usuario;
import trilha.testsjunit.barriga.domain.exceptions.ValidationException;
import trilha.testsjunit.barriga.domain.service.repository.UsuarioRepository;

public class UsuarioService {

    private UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository){
        this.repository = repository;
    }
    public Usuario salvar(Usuario usuario){
        repository.getUserByEmail(usuario.getEmail()).ifPresent(usuario1 -> {
            throw new ValidationException(String.format("Usuário %s já cadastrado!", usuario1.getEmail()));
        });
        return repository.salvar(usuario);
    }
}
