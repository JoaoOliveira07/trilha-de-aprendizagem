package projetos.caixaeletronico;


//Anotações e injeções de dependencias <-- Pesquisar

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caixaeletronico")
public class CaixaEletronicoController {


    @GetMapping
    public String hello(@RequestParam Integer value) {

        int valorOriginal = value;
        int nota200 = 200;
        int nota100 = 100;
        int nota50 = 50;
        int nota20 = 20;
        int nota10 = 10;
        int nota5 = 5;
        int nota2 = 2;

        if (nota200 >= nota200) {
            nota200 = value / 200;
            value = value % 200;
            if (nota100 != 0)
                System.out.println(nota200 + " notas de R$ 200,00");
        }
        if (nota100 >= nota100) {
            nota100 = value / 100;
            value = value % 100;
            if (nota100 != 0)
                System.out.println(nota100 + " notas de R$ 100,00");
        }
        if (nota50 >= nota50) {
            nota50 = value / 50;
            value = value % 50;
            if (nota100 != 0)
                System.out.println(nota50 + " notas de R$ 50,00");
        }
        if (nota20 >= nota20) {
            nota20 = value / 20;
            value = value % 20;
            if (nota20 != 0)
                System.out.println(nota20 + " notas de R$ 20,00");
        }
        if (nota10 >= nota10) {
            nota10 = value / 10;
            value = value % 10;
            if (nota10 != 0)
                System.out.println(nota10 + " notas de R$ 10,00");
        }
        if (nota5 >= nota5) {
            nota5 = value / 5;
            value = value % 5;
            if (nota5 != 0)
                System.out.println(nota5 + " notas de R$ 5,00");
        }
        if (nota2 >= nota5) {
            nota2 = value / 2;
            value = value % 2;
            if (nota2 != 0)
                System.out.println(nota2 + " notas de R$ 2,00");
        }
        String retorno = "";

        retorno = retorno+"A quantidade de notas de R$200,00 é: " +nota200+ "\n"
        +"A quantidade de notas de R$100,00 é: " +nota100+ "\n"
        +"A quantidade de notas de R$50,00 é: " +nota50+ "\n"
        +"A quantidade de notas de R$20,00 é: " +nota20+ "\n"
        +"A quantidade de notas de R$10,00 é: " +nota10+ "\n"
        +"A quantidade de notas de R$5,00 é: " +nota5+ "\n"
        +"A quantidade de notas de R$2,00 é: " +nota2;
        CaixaDTO caixaDTO = new CaixaDTO();
        caixaDTO.setNota2(nota2);
        caixaDTO.setNota5(nota5);
        caixaDTO.setNota10(nota10);
        caixaDTO.setNota20(nota20);
        caixaDTO.setNota50(nota50);
        caixaDTO.setNota100(nota100);
        caixaDTO.setNota200(nota200);
        caixaDTO.setValorOriginal(valorOriginal);

        return ("O valor selecionado foi de: R$" +valorOriginal+ retorno);
    }

    @GetMapping("/v2")
    public StringBuilder caixav2(@RequestParam Integer value) {
        CaixaEletronicoService service = new CaixaEletronicoService();
        return service.getSaque(value);
    }
}
