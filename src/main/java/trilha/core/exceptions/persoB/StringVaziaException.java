package trilha.core.exceptions.persoB;

public class StringVaziaException extends RuntimeException {
    private String nomeDoAtributo;

    public StringVaziaException(String NomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo %s está vazio.", nomeDoAtributo);
    }
}
