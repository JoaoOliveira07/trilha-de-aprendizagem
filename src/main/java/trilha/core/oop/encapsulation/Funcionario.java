package trilha.core.oop.encapsulation;

public class Funcionario {
    private double salario;
    private String nome;

    public void setNome(String nome) {
         this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}