package javaapplication12;

import java.util.Scanner;

public class JavaApplication12 {

  
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       Calculadora calculadora = new Calculadora();
        CalculadoraEspecial calculadoraEspecial = new CalculadoraEspecial();

       boolean salir = false;
       int opcion; 
       
      

       do{
           System.out.println("");
           System.out.println("=======================");
           System.out.println("1. Sumar");
           System.out.println("2. Restar");
           System.out.println("3. Multiplicar");
           System.out.println("4. Dividir");
           System.out.println("5. Raiz Cuadrada");
           System.out.println("6. Verificar numero Primo");
           System.out.println("7. potencia");
           System.out.println("8. logaritmo");
           System.out.println("9. seno");
           System.out.println("10.coseno");
           System.out.println("11.factorial");
           System.out.println("12.Fibonacci"); 
           System.out.println("13.Salir");
           System.out.println("Selecciona una opcion");
           System.out.println("=======================");
           opcion = sn.nextInt();
            switch(opcion){
                case 1:
                   System.out.println("El resultado de la suma es = " + calculadora.sumar(10, 5));
                   break;
                case 2:
                   System.out.println("El resultado de la resta es = " +calculadora.restar(10, 5));
                   break;
                case 3:
                   System.out.println("El resultado de la multiplicacion es = " +calculadora.multiplicar(10, 5));
                   break;
                case 4:
                    System.out.println("El resultado de la division es = " +calculadora.dividir(10, 5));
                    break;
                case 5:
                    System.out.println("El resultado de la raiz cuadrada es = " +calculadora.raizCuadrada(16));
                    break;
                case 6:
                    System.out.println("Es primo? = " +calculadora.esPrimo(11));
                    break;
                case 7:
                    System.out.println("El resultado de la potencia es = " +calculadoraEspecial.potencia (10, 5));
                    System.out.println(calculadoraEspecial.sumar(10, 5));
                    break; 
                case 8:
                    System.out.println("El resultado del logaritmo es = " +calculadoraEspecial.logaritmo (10));
                    System.out.println(calculadoraEspecial.restar(10, 5));
                    break;  
                case 9:
                    System.out.println("El resultado del seno es = " +calculadoraEspecial.seno (12));
                    System.out.println(calculadoraEspecial.multiplicar(10, 5)); 
                    break;
                case 10:
                    System.out.println("El resultado del coseno es = " +calculadoraEspecial.coseno (9));
                    System.out.println(calculadoraEspecial.dividir(10, 5)); 
                    break;    
                case 11:
                    System.out.println("El resultado del factorial es = " +calculadoraEspecial.factorial (12));
                    System.out.println(calculadoraEspecial.raizCuadrada(16));
                    break; 
                case 12:
                    System.out.println("El resultado del Fibonacci es = " +calculadoraEspecial.fibonacci (8));
                    System.out.println(calculadoraEspecial.esPrimo(11)); 
                    break;       
                    
                case 13:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 13");
            }
       }
        while(!salir);   
        
    }
}