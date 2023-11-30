package barriga;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import trilha.testsjunit.barriga.Calculadora;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @BeforeEach
    public void setup(){
        System.out.println("^^^");
    }

    @AfterEach
    public void teardown(){
        System.out.println("vvv");
    }

    @BeforeAll
    public static void setupAll(){
        System.out.println("--- Before All ---");
    }

    @AfterAll
    public static void teardownll(){
        System.out.println("--- After All ---");
    }


    @Test
    public void testSoma() {
        calculadora.soma(2, 3);
        Assertions.assertTrue(calculadora.soma(2, 3) == 5);
        Assertions.assertEquals(5, calculadora.soma(2, 3));
    }

    @Test
    public void assertivas() {
        Assertions.assertEquals("Casa", "Casa");
        Assertions.assertNotEquals("Casa", "casa");
        Assertions.assertTrue("casa".equalsIgnoreCase("CASA"));
        Assertions.assertTrue("Casa".endsWith("sa"));
        Assertions.assertFalse("Casa".startsWith("ca"));

        List<String> s1 = new ArrayList<>();
        List<String> s2 = new ArrayList<>();
        List<String> s3 = null;

        Assertions.assertEquals(s1, s2);
        Assertions.assertSame(s1, s1);
        Assertions.assertNotEquals(s1, s3);
        Assertions.assertNull(s3);
        assertNotNull(s1);

    }

    @Test
    public void deveRetornarNumeroInteiroNaDivisao() {
        float resultado = calculadora.dividir(6, 2);
        Assertions.assertEquals(3, resultado);
    }

    @Test
    public void deveRetornarNumeroNegativoNaDivisao() {
        float resultado = calculadora.dividir(6, -2);
        Assertions.assertEquals(-3, resultado);
    }

    @Test
    public void deveRetornarNumeroDecimalNaDivisao() {
        float resultado = calculadora.dividir(10, 3);
        Assertions.assertEquals(3.3333332538604736, resultado);
        Assertions.assertEquals(3.33, resultado,0.01);
    }

    @Test
    public void deveRetornarZeroComNumeradorZeroNaDivisao() {
        float resultado = calculadora.dividir(0, 2);
        Assertions.assertEquals(0, resultado);

    }

    @Test
    public void deveLancarExcecaoQuandoDividirPorZero_Junit4() {
        try {
            float resultado = 10 / 0;
            Assertions.fail("Deveria ter lançado uma Exceção0");
        }catch (ArithmeticException e){
            Assertions.assertEquals("/ by zero", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcecaoQuandoDividirPorZero_Junit5() {
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            float resultado = 10 / 0;
        });
        Assertions.assertEquals("/ by zero", exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Teste1", "Teste 2"})
    public void testStrings(String param){
        System.out.println(param);
        assertNotNull(param);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "6, 2, 3",
            "6, -2, -3",
            "10, 3 ,3.3333332538604736",
            "0, 2, 0"
    })
    public void deveDividirCorretamente(int num, int den, float res){
        float resultado = calculadora.dividir(num, den);
        Assertions.assertEquals(res, resultado);
    }
}