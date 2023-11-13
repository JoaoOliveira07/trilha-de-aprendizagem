package trilha.core.datastructures.versaotwo;

public class Usuario2{
    String nome;
    String email;

    public boolean equals(Object obj) {
        if (obj instanceof Usuario2) {
            Usuario2 outro = (Usuario2) obj;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }
}
