/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.extra.guia5;

import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Ejercicio2ExtraGuia5 {

    /**
     * Escriba un programa que averigüe si dos vectores de N 
     * enteros son iguales (la comparación deberá 
     * detenerse en cuanto se detecte alguna diferencia 
     * entre los elementos).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        System.out.println("Ingrese el tamaño de los vectores");
        int tam=leer.nextInt();
        boolean resultado=true;
        int vector[]=new int[tam];
        int vector2[]= new int[tam];
        
        //cargamos el primer vector
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un numero");
            vector[i]=leer.nextInt();
        }
        //cargamos el segundo vector
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Ingrese un numero");
            vector2[i]=leer.nextInt();
        }
    
        for (int i = 0; i < tam; i++) {
            if (vector[i]!=vector2[i]){
               resultado=false;
                break; 
            }
            
        }
        System.out.println("Los vectores son "+resultado);
    }
    
}
