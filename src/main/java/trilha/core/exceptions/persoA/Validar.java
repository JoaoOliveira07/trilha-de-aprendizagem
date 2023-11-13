package trilha.core.exceptions.persoA;


import trilha.core.exceptions.Aluno;

public class Validar {
    private Validar(){
    }
    public static void usuario(Aluno aluno) throws StringVaziaException, NumeroNegativoException{//Lançar duas exceptions
        if (aluno == null){
            throw new IllegalArgumentException("O aluno está nulo");
        }
        if (aluno.nome == null || aluno.nome.trim().isEmpty()){
            throw new StringVaziaException("nome");
        }
        if (aluno.nota < 0 || aluno.nota > 10){
            throw new NumeroNegativoException("nota");
        }
    }
}
