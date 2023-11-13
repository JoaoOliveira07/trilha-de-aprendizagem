package trilha.core.exceptions;

import javax.swing.plaf.PanelUI;
import java.util.Objects;

public class Aluno {
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
    public Aluno(){

    }

    public String nome;
    public double nota;

    public String toString(){
        return nome + " tem nota " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(nota, aluno.nota) == 0 && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }
}
