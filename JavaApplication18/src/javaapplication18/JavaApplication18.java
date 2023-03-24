/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
   
        public static void main(String[] args) {
       String frase;
       int longitud;
       frase="";
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("Ingresa una frase");
            frase=leer.nextLine();
       longitud= frase.length();
            
            
        }while(!frase.substring(longitud-1, longitud).equals("."));
        
        String fraseC=codificar(frase);
            System.out.println(fraseC);
        System.out.println(longitud);
    }
    
    
    
    public static String codificar(String frase){
        String x, cadena;
        cadena="";
        for (int i = 0; i < frase.length(); i++) {
            x=frase.substring(i, i+1);
            switch (x) {
                case "a":
                    
                        x="@";
                      
                    break;
                    case "e":
                    
                         x="#";
                    break;
                    case "i":
                    
                        x="$";
                    break;
                    case "o":
                    
                         x="%";
                    break;
                    case "u":
                    
                        x="*";
                    break;
                default:

            }
            cadena+=x;
        }
       
        return cadena;
    }
    }
    
}
