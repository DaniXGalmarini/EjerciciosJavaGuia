/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.estudiante;
import java.util.Scanner;

/**
 *
 * @author
 * dgalm
 */
public class estudianteServicios {
    
    public estudiante crearEstudiante(){
        Scanner leer = new Scanner(System.in);        
        System.out.println("Ingresar nombre de estudiante");
       String nombre=leer.next();
        System.out.println("Ingrese nota");
        double nota=leer.nextDouble();
        return new estudiante(nombre,nota);
       }
    
    
    public double promedio(estudiante []a){
        double suma=0;
        for (int i = 0; i < a.length; i++) {
            suma+=a[i].getNota();
        }
       
        return suma/a.length;
    }
    
    public estudiante[] mayorPromedio(estudiante []a){
        double promedio=promedio(a);
        int contador=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].getNota()>promedio){
                contador++;
            }
        }
        estudiante [] mayorPro=new estudiante[contador];
        for (int i = 0; i < mayorPro.length; i++) {
            mayorPro[i]=new estudiante(); 
        }
        int cuentanew=0;
        for (int i = 0; i < a.length; i++) {
           if(a[i].getNota()>promedio){
               mayorPro[cuentanew].setNombre(a[i].getNombre());
               mayorPro[cuentanew].setNota(a[i].getNota());
               cuentanew++;
           }
            
        }
        return mayorPro;
    }
    
    public void mostrarmayor(estudiante[] a){
        System.out.println("Los alumnos con mayor nota al promedio a "+promedio(a)+ " son: ");
        estudiante []aux=mayorPromedio(a);
        for (int i = 0; i < aux.length; i++) {
            System.out.println(aux[i].getNombre()+" con una nota de: "+aux[i].getNota());
        }
    }
}
