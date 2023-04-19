/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

import Entidad.NIF;
import nifServicios.nifServicios;

/**
 *
 * @author dgalm
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nifServicios s1= new nifServicios();
        
        NIF n1= new NIF();
        NIF n2= new NIF();
        s1.crearNIF(n1);
        s1.mostrar(n1);
        s1.crearNIF(n2);
        s1.mostrar(n2);
        

    }
    
}
