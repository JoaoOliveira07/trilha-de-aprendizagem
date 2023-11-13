package trilha.core.exceptions.persoA;

public class StringVaziaException extends Exception {
    private String nomeDoAtributo;

    public StringVaziaException(String NomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo %s está vazio.", nomeDoAtributo);
    }
}
