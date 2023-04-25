/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ovied
 */
public class PersonaServicio {
    
    public Persona crearPersona(){
        Scanner leer=new Scanner(System.in);
        Persona p1=new Persona();
        System.out.println("Ingrese nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingrese dia nacimiento");
        int dia=leer.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes=leer.nextInt();
        System.out.println("Ingrese año de nacimiento");
        int anio=leer.nextInt();
        Date fecha=new Date(anio-1900, mes-1,dia);
        p1.setFechaNac(fecha);
        return p1;
    }
    
//    Método calcularEdad que calcule la edad del usuario 
//            utilizando el atributo de fecha de nacimiento y la fecha actual.
            public int calcularEdad(Persona d){
                Date fechaActual=new Date();
                return fechaActual.getYear()-d.getFechaNac().getYear();
            }
    
//     //Método menorQue recibe como parámetro una Persona y una edad. 
//            Retorna true si la persona es menor que la edad consultada
//                    o false en caso contrario.
       
            public boolean menorQue(Persona d, int edad){
                if (edad>calcularEdad(d)){
                    return true;
                }
                return false;
            }
            
            public void mostrarPersona(Persona f){
                System.out.println(f.toString());
            }
}
