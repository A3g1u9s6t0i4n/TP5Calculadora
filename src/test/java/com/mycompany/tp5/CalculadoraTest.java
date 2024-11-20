
package com.mycompany.tp5;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;


public class CalculadoraTest {
    private static Calculadora calculadora;

    @BeforeClass
    public static void inicializar() {
        calculadora = new Calculadora();
        System.out.println("BIENVENIDO AL TEST DE CALCULADORA");
    }

    @Before
    public void antesDeCadaMetodo() {
        System.out.println("....." + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void testSuma() {
        assertEquals(5.5, calculadora.sumar(2.5,3.0), 0.001);
    }

    @Test
    public void testResta() {
        assertEquals(1.5, calculadora.restar(5.0, 3.5), 0.001);
    }

    @After
    public void despuesDeCadaMetodo() {
        System.out.println("FIN DE LA PRUEBA, CAMPOS EN 0");
    }

    @AfterClass
    public static void finalizar() {
        System.out.println("OPERACION FINALIZADA");
    }

}