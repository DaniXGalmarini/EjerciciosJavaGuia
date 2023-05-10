/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import Entidad.estudiante;
import Servicios.estudianteServicios;
import java.util.Arrays;


public class Integrador {

    
    public static void main(String[] args) {
      estudianteServicios es=new estudianteServicios();
      estudiante [] e=new estudiante[5];
        for (int i = 0; i < e.length; i++) {
            e[i]=es.crearEstudiante();         
        }
       
       es.mostrarmayor(e);
    }
    
}
