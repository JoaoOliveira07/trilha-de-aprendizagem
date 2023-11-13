package trilha.core.exceptions.persoB;


import trilha.core.exceptions.Aluno;

public class TesteValidacao {
    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("João", 7);
            Validar.usuario(aluno);
            System.out.println("Aluno: " + aluno.nome + "\nNota: " + aluno.nota);
            Validar.usuario(null);
        } catch (StringVaziaException | NumeroNegativoException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim :)");
    }
}
