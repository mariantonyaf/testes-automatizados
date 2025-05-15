import org.junit.*;

import static org.junit.Assert.*;

public class CalculadoraTest {

    private Calculadora calc;

    @BeforeClass
    public static void iniciarSuite() {
        System.out.println(">>> INÍCIO DOS TESTES <<<");
    }

    @AfterClass
    public static void encerrarSuite() {
        System.out.println(">>> FIM DOS TESTES <<<");
    }

    @Before
    public void setUp() {
        calc = new Calculadora();
        System.out.println("Iniciando um teste...");
    }

    @After
    public void tearDown() {
        System.out.println("Teste finalizado.\n");
    }

    @Test
    public void testSoma() {
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    public void testSubtracao() {
        assertEquals(4, calc.subtrair(10, 6));
    }

    @Test
    public void testMultiplicacao() {
        assertEquals(12, calc.multiplicar(3, 4));
    }

    @Test
    public void testDivisao() {
        assertEquals(5, calc.dividir(10, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisaoPorZero() {
        calc.dividir(10, 0);
    }

    @Test
    public void testEhParComPar() {
        assertTrue(calc.ehPar(8));
    }

    @Test
    public void testEhParComImpar() {
        assertFalse(calc.ehPar(7));
    }

    @Test
    public void testFatorialDeZero() {
        assertEquals(1, calc.fatorial(0));
    }

    @Test
    public void testFatorialDeCinco() {
        assertEquals(120, calc.fatorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFatorialNegativo() {
        calc.fatorial(-3);
    }
}