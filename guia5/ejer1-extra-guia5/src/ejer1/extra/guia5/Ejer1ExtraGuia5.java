/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1.extra.guia5;

import java.util.Scanner;

/**
 *Realizar un algoritmo que calcule la suma
 * de todos los elementos de un vector de tamaño N, 
 * con los valores ingresados por el usuario.

 * @author dgalm
 */
public class Ejer1ExtraGuia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  
        System.out.println("Ingrese tamaño del vector");
        int tam=leer.nextInt();
        
        int[] vector=new int[tam];
        
        
        //carcando el vector 
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un numero");
            vector[i]=leer.nextInt();
            
        }
        int suma=0;
        //sumar los numeros cargados
        for (int i = 0; i < vector.length; i++) {
            suma+=vector[i];
            
        }
            
        System.out.println("La suma de los numeros del vector es: "+suma);
            
        }
     
    }
    

