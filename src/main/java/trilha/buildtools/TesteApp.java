package trilha.buildtools;

import org.apache.commons.lang3.StringUtils;

public class TesteApp {

    public static void main(String[] args) {
        String nome = "João Paulo Oliveira";

        System.out.println(StringUtils.abbreviate(nome,13));

    }
}
