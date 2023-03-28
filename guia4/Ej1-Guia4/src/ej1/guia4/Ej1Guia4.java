/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.guia4;

import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Ej1Guia4 {

    /**
     *Crea una aplicación que le pida 
     * dos números al usuario y este pueda elegir 
     * entre sumar, restar, multiplicar y dividir. La aplicación debe tener 
     * una función para cada operación matemática
     * y deben devolver sus resultados para imprimirlos en el main. 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);   
        System.out.println("Ingrese primer numero");
        int num1= leer.nextInt();
        System.out.println("Ingrese segundo numero");
        int num2= leer.nextInt();
        int opcion;
        
        do{
            System.out.println("Elija la operacion a realizar");
            System.out.println("1-Sumar");
             System.out.println("2-Restar");
              System.out.println("3-Multiplicacion");
               System.out.println("4-Division");
               System.out.println("5-Salir");
               opcion=leer.nextInt();
               
               switch (opcion) {
                   case 1:
                       sumar(num1, num2);
                       
                       break;
                   case 2:
                       restar(num1, num2);
                       break;
                   case 3:
                       multiplicar(num1, num2);
                       break;
                   case 4:
                       dividir(num1, num2);
                       break;
                   default:
               }
               
               
               
               
               
        } while (opcion!=5);
        
    }
    
    public static void sumar(int num1, int num2) {
        int suma=(num1+num2);
                System.out.println("la suma es: "+suma);
    }
    public static void restar(int num1, int num2) {
        int resta=(num1-num2);
                System.out.println("la resta es: "+resta);
    }
    public static void multiplicar(int num1, int num2) {
        int multiplicacion=(num1*num2);
                System.out.println("la multiplicacion es: "+multiplicacion);
    }
    public static void dividir(int num1, int num2) {
        double dividir=(num1/num2);
                System.out.println("la division es: "+dividir);
    }

}
