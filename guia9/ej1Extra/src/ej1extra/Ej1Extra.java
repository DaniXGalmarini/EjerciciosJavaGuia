/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1extra;

import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Ej1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
      String mesAdivina;
        String [] meses= {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
      String mesSecreto=meses[(int) (Math.random()*11)];
      
      do{
          System.out.println("Ingrese un mes a adivinar");
          mesAdivina=leer.next();
      }while (!mesAdivina.equalsIgnoreCase(mesSecreto));
      
      if (mesAdivina.equalsIgnoreCase(mesSecreto)){
          System.out.println("Felicitaciones! Acertaste");
      }
    }
    
}
