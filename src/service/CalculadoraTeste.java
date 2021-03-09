package service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTeste {

    private static final double DELTA = 0;
    private Calculadora calc;

    @Before
    public void setUp() {
        calc = new Calculadora(10, 2);
    }

    @Test
    public void testSomaDeveRetornarDoze() {
        assertEquals(12, calc.getSoma(), DELTA);
    }

    @Test
    public void testSubtracaoDeveRetornarOito() {
        assertEquals(8, calc.getSubtracao(), DELTA);
    }

    @Test
    public void testMultiplicacaoDeveRetornarVinte() {
        assertEquals(20, calc.getMultiplicacao(), DELTA);
    }

    @Test
    public void testDivisaoDeveRetornarCinco() {
        assertEquals(5, calc.getDivisao(), DELTA);
    }

    @Test
    public void testDivisaoDeveRetornarFalha() {
        assertEquals(2, calc.getDivisao(), 0);
    }

    @Test
    public void testSomaDeveRetornar0QuandoPassamosZeroEZero() {
        double n1 = 0;
        double n2 = 0;

        Calculadora calc = new Calculadora(n1, n2);

        double resultadoObtido = calc.getSoma();
        double resultadoEsperado = 0;
        assertEquals(resultadoEsperado, resultadoObtido, DELTA);
    }
}