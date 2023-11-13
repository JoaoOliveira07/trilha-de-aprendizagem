package trilha.core.exceptions.persoA;


import trilha.core.exceptions.Aluno;

public class TesteValidacao {
    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("", 7);
            Validar.usuario(aluno);
            Validar.usuario(null);
        } catch (StringVaziaException | NumeroNegativoException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }
}
