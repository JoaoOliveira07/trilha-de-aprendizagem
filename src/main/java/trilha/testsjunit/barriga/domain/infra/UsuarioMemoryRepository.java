package trilha.testsjunit.barriga.domain.infra;


import trilha.testsjunit.barriga.domain.Usuario;
import trilha.testsjunit.barriga.domain.service.repository.UsuarioRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsuarioMemoryRepository implements UsuarioRepository {

    private List<Usuario> users;
    private Long currentId;

    public UsuarioMemoryRepository() {
        currentId = 0L;
        users = new ArrayList<>();
        salvar(new Usuario(nextId(), "User #1", "user@gmail.com","12345678"));
    }

    @Override
    public Usuario salvar(Usuario usuario) {
        Usuario newUser = new Usuario(nextId() , usuario.getNome(), usuario.getEmail(), usuario.getSenha());
        users.add(newUser);
        return newUser;
    }

    @Override
    public Optional<Usuario> getUserByEmail(String email) {
        return users.stream().filter(usuario -> usuario.getEmail().equalsIgnoreCase(email)).findFirst();
    }

    public void printUsers(){
        System.out.println(users);
    }
    private Long nextId(){
        return ++currentId;
    }

    public static void main(String[] args) {
        UsuarioMemoryRepository repo = new UsuarioMemoryRepository();
        repo.printUsers();
        repo.salvar(new Usuario(null,"Usuário qlqr","a@a.com","aaa"));
        repo.printUsers();
        repo.salvar(new Usuario(null,"Usuário qre","a@a.com","aaa"));
        repo.printUsers();

    }
}
