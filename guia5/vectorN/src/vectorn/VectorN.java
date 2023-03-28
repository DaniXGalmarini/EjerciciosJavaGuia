/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorn;

import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class VectorN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //ingrese tamaño del vector
        System.out.println("Ingrese el tamaño del vector");
        int tam=leer.nextInt();
        //carga el vector
        int[] vector = cargarVector(tam);
        //muestra el vector
        mostrarVector(vector, tam);
        //elije numero a buscar y aplica funcion
            System.out.println("Que numero desea buscar?");
            int busca=leer.nextInt();
            buscarNum(vector, busca, tam);               
        }
     // funcion cargar   
     public static int[] cargarVector(int tam) {   
         int[] vector= new int[tam];
         for (int i = 0; i < tam; i++) {
            vector[i] = (int) (Math.random()*20); 
         }
         return vector;
     }
     //funcion mostarr
     public static void mostrarVector(int [] vector, int tam) {    
        for (int i = 0; i < tam; i++) {
            System.out.println(vector[i]);            
         }
     }
     //funcion busqueda
    public static void buscarNum(int []vector, int busca, int tam) {   
        int contador=0; 
        for (int j = 0; j < tam; j++) {
                if (vector[j]==busca){
                    System.out.println("Se encontro el numero "+busca+" en la posicion "+ j+ " del vector");
                    contador++;
                }
            }
        System.out.println("Aparece un total de: " + contador + " veces");   
    }
}
