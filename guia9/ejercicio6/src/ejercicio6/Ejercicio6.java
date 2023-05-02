/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import Entidad.Curso;
import Servicios.CursoServicios;

/**
 *
 * @author dgalm
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoServicios cs=new CursoServicios();
        Curso m=new Curso();
        
        cs.crearCurso(m);
        
        
        System.out.println(cs.calcularGanancia(m));

    }
    
}
