package service;


import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    private static final double DELTA = 0.000001;
    @Test
    public void testDivisaoDeveRetornarNaNQuandoPassamosZeroEZero() {
        double n1 = 0;
        double n2 = 0;

        Calculadora calc = new Calculadora(n1, n2);

        double resultadoObtido = calc.getDivisao();
        double resultadoEsperado = Double.NaN;

        assertEquals(resultadoEsperado, resultadoObtido, DELTA);
    }
}