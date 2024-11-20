package com.mycompany.tp5;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Test;

@RunWith(Parameterized.class)

public class ParameterTest {
    private final double a;
    private final double b;
    private final double resultadoEsperado;

    public ParameterTest(double a, double b, double resultadoEsperado) {
        this.a = a;
        this.b = b;
        this.resultadoEsperado = resultadoEsperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][]{
                {8, 7, 15},
                {2, 0, 2},
                {10, -1, 9}
        });
    }

    @Test
    public void testSuma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(resultadoEsperado, calculadora.sumar(a, b), 0.001);
    }
}
