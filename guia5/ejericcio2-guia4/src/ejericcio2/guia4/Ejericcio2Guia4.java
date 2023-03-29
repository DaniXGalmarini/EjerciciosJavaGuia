/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericcio2.guia4;

import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Ejericcio2Guia4 {

    /**
     * Realizar un algoritmo que llene un vector de tamaño N 
     * con valores aleatorios y le pida al usuario un número 
     * a buscar en el vector. El programa 
     * mostrará dónde se encuentra el numero y si se encuentra repetido
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        System.out.println("Ingrese la cantidad de numero a cargar");
        int N=leer.nextInt();
        
        //creamos el vector
        int [] vector = new int[N];
        // llenamos el vector
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int)(Math.random() * 10);
        }
        // buscar numero
        System.out.println("Ingrese un numero a buscar");
        int numB= leer.nextInt();
        int contador=0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==numB){
                contador++;
                System.out.println("El numero "+ numB+ " esta en la posicion "+i);
            }
            
        }
        if (contador>0){
                    System.out.println("El numero se encontro "+ contador+ " veces");

        }else{
            System.out.println("El numero "+ numB+ " no se encuentra en el vector");
        }
        
        
        //mostrarlo en orden descendente
        for (int i =(vector.length-1) ; i >=0 ; i--) {
            System.out.println(vector[i]+" Posicion de vector "+i);
            
        }
        
    }
    
}