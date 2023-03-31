/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.extra.guia5;

import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Ejercicio3ExtraGuia5 {

    /**
     * Crear una función rellene un vector con números aleatorios, 
     * pasándole un arreglo por parámetro. 
     * Después haremos otra función o procedimiento 
     * que imprima el vector.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[] vector= new int[10];
        
        rellenarVector(vector);

        imprimirVector(vector);

        }
    
    //rellenamos el vector
    public static void rellenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int) (Math.random()*10);
            }
       // return vector;
    }
    //imprimir vector
    public static void imprimirVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }    
        
 }


