package javaapplication12;

public class CalculadoraEspecial extends Calculadora {
     
 public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
 
 
 public double logaritmo(double numero) {
        return Math.log(numero);
    }
 
 
 
    public double seno(double angulo) {
        return Math.sin(angulo);
    }

    
    public double coseno(double angulo) {
        return Math.cos(angulo);
    }

    
    public int factorial(int numero) {
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
     public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
    

 