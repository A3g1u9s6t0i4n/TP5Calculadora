
package com.mycompany.tp5;

/**
1. Realizar la clase java calculador que permite por el momento,
realizar las cuatro operaciones matemáticas básicas. Use solo para
Suma y Resta de números con coma. 
 */
public class Calculadora {
   
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    
    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
    if (b == 0) {
        throw new ArithmeticException("Division por 0 no permitida");
    }
    return a / b;
}

}


