/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creandoclases;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class CreandoClases {

    /**j
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Scanner leer = new Scanner(System.in);        
        
            Persona Danix=new Persona();
            Persona Mike=new Persona("Miguel", "Gonzalez",40,2937484);

           System.out.println("Ingrese su nombre");
           Danix.nombre=leer.nextLine();
           
           System.out.println(Danix.nombre);
       
       System.out.println(Mike.nombre+" "+Mike.apellido+" "+Mike.edad);
            
            System.out.println("Cambie nombre de Mike");
            Mike.nombre=leer.nextLine();
            
            System.out.println(Mike.nombre+" "+Mike.apellido+" "+Mike.edad);
            
            
            
    }
    
}
