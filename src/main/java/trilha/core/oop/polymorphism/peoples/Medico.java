package trilha.core.oop.polymorphism.peoples;


public class Medico extends Pessoa{
    String matricula;
    String horasTrabalhada;

    Medico(String matricula, String horasTrabalhada, String nome, int idade, String documento){
        super(nome, idade, documento);
        this.matricula = matricula;
        this.horasTrabalhada = horasTrabalhada;
    }

    @Override
    public void imprimirInfo(){
        super.imprimirInfo();
        System.out.println("Matricula do Médico: " + this.matricula);
        System.out.println("Horário de trabalho: " + this.horasTrabalhada+"\n");
    }
}
