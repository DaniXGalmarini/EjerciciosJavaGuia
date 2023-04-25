/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.guia9;

import Entidad.Persona;
import Servicios.PersonaService;

/**
 *
 * @author dgalm
 */
public class Ejercicio5Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService ps=new PersonaService();
        Persona p1=ps.Persona();
        
        System.out.println(ps.calcularEdad(p1)+" Años");
        System.out.println("----------------------");
        System.out.println(ps.esMenor(p1, 46));
        System.out.println("----------------------");
        ps.mostrarPersona(p1);
    }
    
}
