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
 *Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
 * Retornar el objeto Persona creado.
 * 
Método calcularEdad que calcule la edad del usuario 
* utilizando el atributo de fecha de nacimiento y la fecha actual.
* 
Método menorQue recibe como parámetro una Persona y una edad. 
* 
* Retorna true si la persona es menor que la edad consultada o false en caso contrario.
* 
Método mostrarPersona que muestra la información de la persona deseada.

 * @author dgalm
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in);        
    public Persona Persona(){
            System.out.println("Ingrese nombre de la persona");
            String nombre=leer.next();
            System.out.println("Ingrese dia de nacimiento");
            int dia=leer.nextInt();
            System.out.println("Ingrese mes de nacimiento");
            int mes=leer.nextInt();
            System.out.println("Ingrese Año de nacimiento");
            int anio=leer.nextInt();
            Date fecha= new Date(anio-1900,mes-1,dia);
            Persona p=new Persona(nombre,fecha);
            return p;          
        }
    public int calcularEdad(Persona p){
        Date fechaAct=new Date();
        int edad=fechaAct.getYear()-p.getFechaNac().getYear();
        return edad;
    }
    
    public boolean esMenor(Persona x, int d){
        if (calcularEdad(x)>d){
            return false;
        }
        return true;
    }
    
    public void mostrarPersona(Persona d){
        System.out.println(d.toString());
    }
    
}
