/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.guia4;

/**
 *
 * @author dgalm
 */
public class Ejercicio1Guia4 {

    /**
     * Realizar un algoritmo que llene un vector 
     * con los 100 primeros números enteros y 
     * los muestre por pantalla en orden descendente.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos el vector
        int [] vector = new int[100];
        // llenamos el vector
        for (int i = 0; i < vector.length; i++) {
            vector[i]=i+1;
        }
        //mostrarlo en orden descendente
        for (int i =(vector.length-1) ; i >=0 ; i--) {
            System.out.println(vector[i]+" Posicion de vector "+i);
            
        }
        
    }
    
}
