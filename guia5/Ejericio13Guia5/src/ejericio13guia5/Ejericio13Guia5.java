/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericio13guia5;

import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Ejericio13Guia5 {

    /**
     *Crea un vector llamado ‘Equipo’ cuya dimensión
     * sea la cantidad de compañeros de equipo y define 
     * su tipo de dato de tal manera que te permita alojar 
     * sus nombres más adelante.
     * Utilizando un Bucle for, 
     * aloja en el vector Equipo, 
     * los nombres de tus compañeros de equipo

     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        System.out.println("Ingrese la cantidad de alumnos");
        int cant= leer.nextInt();
      leer.nextLine();
        String [] Equipo= new String[cant];
        
        for (int i = 0; i < Equipo.length; i++) {
           
            System.out.println("Ingrese nombre del alumno " + (i+1));
             Equipo[i]=leer.nextLine();
        }
        for (String elemento: Equipo) {
            System.out.println(elemento);
            
        }
    }
    
}
