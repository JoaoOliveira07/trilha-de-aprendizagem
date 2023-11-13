package trilha.core.exceptions.persoA;

@SuppressWarnings("Serial")
public class NumeroNegativoException extends Exception {
    private String nomeDoAtributo;

    NumeroNegativoException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo." ,nomeDoAtributo);
    }
}
