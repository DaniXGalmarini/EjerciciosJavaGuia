/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Arrays;
import java.util.Collections;

/**
 *Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.

En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
 * @author dgalm
 */
public class ArregloService {
    
    public void inicializarA(double[] d){
        for (int i = 0; i < d.length; i++) {
            d[i]=Math.random()*10;
        }
    }
    
    public void mostrar(double [] d){
        System.out.println(Arrays.toString(d));
    }
    
    public void ordenar( double [] f){
        double []aux1= new double[f.length];
        System.arraycopy(f, 0, aux1, 0, aux1.length);
        Arrays.sort(aux1);
        double[] aux= new double[f.length];
        for (int i = 0; i < aux1.length; i++) {
            aux[(aux1.length-1)-i]=aux1[i];
                      
        }
        System.out.println(Arrays.toString(aux)); 
    }
//    Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
//* Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    
    public void inicializarB(double [] a, double [] b){
        System.arraycopy(a, 0, b, 0, b.length/2);
        Arrays.fill(b,b.length/2,b.length,0.5);
        
        mostrar(b);
    }
}
