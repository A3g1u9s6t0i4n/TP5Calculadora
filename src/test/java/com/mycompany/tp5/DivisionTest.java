
package com.mycompany.tp5;
import org.junit.Test;

public class DivisionTest {
    @Test(expected = ArithmeticException.class)
    
    public void testDivisionCero() {
        Calculadora calculadora = new Calculadora();
        calculadora.dividir(10, 0);
    }
}

