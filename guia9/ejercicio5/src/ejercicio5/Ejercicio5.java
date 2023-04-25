/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import Entidad.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author ovied
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    PersonaServicio ps=new PersonaServicio();
    Persona p1=ps.crearPersona();
    
        System.out.println(ps.calcularEdad(p1));
        System.out.println(ps.menorQue(p1, 45));
    ps.mostrarPersona(p1);
    
    
    
        }
    
}
