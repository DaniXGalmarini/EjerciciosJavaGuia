/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
        System.out.println("Ingrese una frase: debe terminar con punto");
        String frase;
        frase = in.next();
    
        System.out.println("salida:" + procesar(frase));
        
        
        
    }
    
    public static String procesar(String frase) {
        String salida;
        salida = "";
        String caracter;
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.substring(i, i+1);
            switch (caracter) {
                case "a", "A":
                    caracter = "@";
                case "e", "E":
                    caracter = "#";
                case "i", "I":
                    caracter = "$";
                case "o" , "O":
                    caracter = "%";
                case "u", "U":
                    caracter = "*";
                }
            salida = salida.concat(caracter);
            }
            return (salida);
            
            
    }
        
}