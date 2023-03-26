/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caragnpersonas;

import java.util.Scanner;

/**
 *Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas
 * ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa
 * debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

 */
public class CaragNPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String resp;
        System.out.println("Carga de datos");
        do{
            cargarDatos();
            System.out.println("Desea seguir cargando datos?");
            resp=leer.nextLine();
            resp=resp.toUpperCase();
        }
        while(resp.equals("SI"));
    }   
        
     public static void cargarDatos () {
         Scanner leer = new Scanner (System.in);   
         int  edad;
            String nombre;
            System.out.println("Ingrese nombre de la persona:");
            nombre=leer.nextLine();
            System.out.println("Ingrese Edad:");
            edad=leer.nextInt();
            System.out.println("");
           System.out.println("------------------------------");
           System.out.println(nombre + " - Edad: " + edad);
           System.out.println("");
            if (edad>=18){
                System.out.println("Es mayor de edad");
              }else {
                System.out.println("Es menor de edad");
            }
        System.out.println("------------------------------");
            
        }
        
    }
    

