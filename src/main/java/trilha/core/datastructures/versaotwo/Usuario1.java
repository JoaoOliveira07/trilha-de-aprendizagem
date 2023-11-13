package trilha.core.datastructures.versaotwo;


public class Usuario1 {

    String nome;

    Usuario1(String nome){
        this.nome = nome;
    }
    public String toString(){
        return "Meu nome é "+nome+".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (getClass() != o.getClass())
            return false;
        Usuario1 other = (Usuario1) o;
        if (nome == null){
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
}
