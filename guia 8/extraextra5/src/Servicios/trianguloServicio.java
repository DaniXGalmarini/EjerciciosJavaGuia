/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.triangulo;

/**
 ** Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superfic
 * @author dgalm
 */
public class trianguloServicio {
    
    public double area(triangulo x){
        return (x.getBase()*x.getAltura())/2;
        
    }
    
    public double perimetro(triangulo x){
        return (Math.sqrt(Math.pow(x.getBase()/2, 2)+Math.pow(x.getAltura(), 2)*2))+x.getBase();
        
    }
    
    public void calcular (triangulo [] x){
        double areaMax=0;
        int posicion=0;
        for (int i = 0; i < x.length; i++) {
            if(this.area(x[i])>areaMax){
               areaMax=this.area(x[i]);
               posicion=i;
               
            }
            
        }
        System.out.println("El area mas grande es la del traingulo "+ posicion + " y el valor es: "+areaMax);
        System.out.println("Su base es: " + x[posicion].getBase() + " y su altura es: " +x[posicion].getAltura());
    }
    
}
