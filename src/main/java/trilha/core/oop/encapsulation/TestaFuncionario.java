package trilha.core.oop.encapsulation;

public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Thiago Tevez");
        funcionario.setSalario(2500);
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Alexandre Pereira");
        funcionario1.setSalario(4800);

        System.out.println(funcionario.getNome());
        System.out.println("Salário R$"+funcionario.getSalario());
        System.out.println(funcionario1.getNome());
        System.out.println("Salário R$"+funcionario1.getSalario());

    }
}