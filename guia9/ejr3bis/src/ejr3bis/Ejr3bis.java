/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejr3bis;

import Servicios.ArregloService;

/**
 *
 * @author dgalm
 */
public class Ejr3bis {

    /**Clase Arrays
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
* 

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double [] vector1= new double[50];
        double [] vector2= new double[20];
        
        ArregloService as=new ArregloService();
        
        as.inicializarA(vector1);
        as.mostrar(vector1);
        as.ordenar(vector1);
        as.inicializarB(vector1, vector2);
        as.ordenar(vector2);
        
        
       
    }
    
}
