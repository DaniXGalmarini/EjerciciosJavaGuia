/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.persona;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class personaServicios {
    static Scanner leer = new Scanner(System.in);    
    public persona cargarPersona(){
        System.out.println("Ingrese nombre");
        String nombre=leer.next();
        System.out.println("Ingrese apellido");
        String apellido=leer.next();
        System.out.println("Ingrese Edad");
        int edad= leer.nextInt();
        System.out.println("Ingrese DNI");
        int dni= leer.nextInt();
        return new persona (nombre,apellido,edad,dni);
    }
     public static Comparator<persona> compararNombre=new Comparator<persona>(){
            @Override
            public int compare(persona p1, persona p2){
                return p1.getApellido().compareTo(p2.getApellido());
            }
        };
}
