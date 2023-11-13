package trilha.core.oop.polymorphism.peoples;

public class Enfermeiro extends Pessoa{
    String matricula;
    String horasTrabalhada;

    Enfermeiro(String matricula, String horasTrabalhada, String nome, int idade, String documento){
        super(nome, idade, documento);
        this.matricula = matricula;
        this.horasTrabalhada = horasTrabalhada;
    }
    @Override

    public void imprimirInfo(){
        super.imprimirInfo();
        System.out.println("Matricula do Enfermeiro: " + this.matricula);
        System.out.println("Horário de trabalho: " + this.horasTrabalhada+"\n");
    }
}