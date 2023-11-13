package trilha.testsjunit.barriga.domain;


import trilha.testsjunit.barriga.domain.exceptions.ValidationException;

public class Conta {
    public Conta(Long id, String nome, Usuario usuario) {
        if (nome == null) throw new ValidationException("Nome é obrigatório!");
        if (usuario == null) throw new ValidationException("Usuário é obrigatório!");

        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
    }

    private Long id;
    private String nome;
    private Usuario usuario;

    public Long id(){
        return id;
    }

    public String nome(){
        return nome;
    }

    public Usuario usuario(){
        return usuario;
    }


}
