/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextraextra3;

import Entidad.Pass;
import Servicios.PassServicios;
import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class EjExtraExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        PassServicios ps=new PassServicios();
        int opcion;
        
       
        
        Pass clave=new Pass("", "Daniel",29203748);
        
         System.out.println(clave);
        do {
            System.out.println("------------------------");
            System.out.println("MENU");
            System.out.println("------------------------");
            System.out.println("1- CARGAR CLAVE");
            System.out.println("2- NIVEL DE CONTRASEÑA");
            System.out.println("3- MODIFICAR CONTRASEÑA");
            System.out.println("4- MODIFICAR NOMBRE");
            System.out.println("5- MODIFICAR DNI");
            System.out.println("6- SALIR");
            opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    ps.crearPass(clave);
                    break;
                case 2:
                    ps.analizarPass(clave);
                    break;
                case 3:
                    ps.modificarPass(clave);
                    break;
                case 4:
                    ps.modificar(clave, 1);
                    break;
                case 5:
                    ps.modificar(clave, 2);
                    break;
                default: System.out.println("Opcion no valida");
            }
        }while ( opcion <6);
    System.out.println(clave);
    }
    
}
