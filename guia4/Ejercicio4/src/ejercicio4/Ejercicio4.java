/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        System.out.println("Ingrese un numero a analizar");
        int num=leer.nextInt();
        int contador=0;
        // boolean resultado;
        // resultado=calculo(num);
        
       if (calculo(num)){
           System.out.println("El numero analizado es primo ");
       } else {
           System.out.println("El numero analizado no es primo");
       }           
    }

    
    public static boolean calculo(int num) {
        boolean resultado;
        int contador=0;
           for (int i= 1; i<=num; i++) {
            if (num%i==0){
                contador++;
            }
        }
        if (contador!=2){
            resultado=false;
        }else{
            resultado=true;
        }
       
       return resultado;
    }
}
