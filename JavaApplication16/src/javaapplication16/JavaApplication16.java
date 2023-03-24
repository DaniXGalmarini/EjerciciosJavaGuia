/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class JavaApplication16 {

    /**
     *Realice un programa para que el usuario adivine el resultado 
     * de una multiplicación entre dos números generados aleatoriamente 
     * entre 0 y 10. El programa debe indicar al usuario 
     * si su respuesta es o no correcta. En caso que la respuesta 
     * sea incorrecta se debe permitir al usuario ingresar su 
     * respuesta nuevamente. Para realizar este ejercicio investigue 
     * como utilizar la función Math.random() de Java.

     */
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
        int num1= (int) (Math.random()*10);
        int num2=(int) (Math.random()*10);
        int resultado=num1*num2; 
        int respuesta;
        System.out.println("Ingrese su resultado: ");
        respuesta= leer.nextInt();
        System.out.println(resultado);
        do{
            System.out.println("Respuesta Incorrecta: (reintente) ");
            respuesta= leer.nextInt();
            
        }
        while (respuesta!=resultado);
        
        System.out.println("Respuesta Correcta");
        
        
        

        }
    
}
