/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option, num1, num2;
        String resp;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer numero a calcular:");
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo numero a calcular:");
        num2=leer.nextInt();
        resp="N";
        
        
        do {
        System.out.println("-------------------");
        System.out.println("MENU");
        System.out.println("-------------------");
        System.out.println("1- SUMAR");
        System.out.println("2- RESTAR");
        System.out.println("3-MULTIPLICAR");
        System.out.println("4-DIVIDIR");
        System.out.println("5-SALIR");
        System.out.println();
        System.out.println("INGRESE UNA OPCION");
        option=leer.nextInt();
      
        
        
        switch (option){
          case 1:
              
              System.out.println("La suma de los numeros es: "+suma (num1,num2));
              break;
          case 2:
              System.out.println("La resta de los numeros es: "+ resta (num1,num2));
              break;
          case 3:
              System.out.println("La multiplicacion de los numeros es: "+ multiplicacion (num1,num2));
              break;
          case 4:
              System.out.println("La division de los numeros es: "+division (num1,num2));
              break;
          case 5:
              System.out.println("Esta seguro de salir? (S/N)");
              resp=leer.next();
              if (resp.equals("S")){
                  System.out.println("SALIR...");
              }
            
      }
        }
        while ((resp.equals("N")) || option !=5);
                  
        
        
        
    }
    public static int suma(int num1, int num2){
    int suma=num1+num2;
    return suma;
    }
    public static int resta(int num1, int num2){
    int resta=num1-num2;
    return resta;
    }
    public static int multiplicacion(int num1, int num2){
    int multiplicacion=num1*num2;
    return multiplicacion;
    }
    public static int division(int num1, int num2){
    int division=num1/num2;
    return division;
    }
}
