package trilha.core.oop.polymorphism.peoples;


public class Principal {
    public static void main(String[] args) {
     Pessoa p = new Pessoa("Ana Cabral", 24, "454578");
     p.imprimirInfo();
     System.out.println();

     Pessoa paciente = new Paciente("5457878","Sulamerica","João Oliveira",19,"455878");
     paciente.imprimirInfo();

     Medico medico = new Medico("52585545","8h as 17h","José Alencar",35,"544878");
     medico.imprimirInfo();

     Enfermeiro enfermeiro = new Enfermeiro("5248785","8h as 17h","Jobson Helizer",35,"258787");
     enfermeiro.imprimirInfo();
    }
}
