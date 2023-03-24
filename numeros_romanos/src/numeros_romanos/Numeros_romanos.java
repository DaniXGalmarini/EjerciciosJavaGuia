/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros_romanos;

import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class Numeros_romanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option;
        String resp;
        Scanner leer=new Scanner(System.in);
        
        do{
        System.out.println("---------------------");
        System.out.println("RECUERDE SALIR CON 11");
        System.out.println("---------------------");
        System.out.println("");
        System.out.println("Ingrese el numero a mostrar en Romano");
        option=leer.nextInt();
        resp="N";
        
        
        switch (option){
          case 1:
              System.out.println("En romano es I");
              System.out.println("");
              break;
          case 2:
              System.out.println("En romano es II");
              System.out.println("");
              break;
          case 3:
              System.out.println("En romano es III");
              System.out.println("");
              break;
          case 4:
              System.out.println("En romano es IV");
              System.out.println("");
              break;
          case 5:
              System.out.println("En romano es V");
              System.out.println("");
              break;
          case 6:
              System.out.println("En romano es VI");
              System.out.println("");
              break;
          case 7:
              System.out.println("En romano es VII");
              System.out.println("");
              break;
          case 8:
              System.out.println("En romano es VIII");
              System.out.println("");
              break;
          case 9:
              System.out.println("En romano es IX");
              System.out.println("");
              break;
          case 10:
              System.out.println("En romano es X");
              System.out.println("");
              break;
          case 11:
              System.out.println("Esta seguro de salir? (S/N)");
              resp=leer.next();
              resp=resp.toUpperCase();
              if (resp.equals("S")){
                  System.out.println("SALIR...");
              }
            
      }
        }
        while ((resp.equals("N")) || option !=11);
                  
        
        
        
    }
    
}