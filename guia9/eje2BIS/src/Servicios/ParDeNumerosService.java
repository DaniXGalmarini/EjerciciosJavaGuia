/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.ParDeNumeros;

/**
 *
 * @author dgalm
 */
public class ParDeNumerosService {
    
   // Método mostrarValores que muestra cuáles son los dos números guardados.

    public void mostrarValores(ParDeNumeros x){
        System.out.println(x.getNum1()+"/"+x.getNum2());
    }
    
    //Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    public void devolverMayor(ParDeNumeros x){
        System.out.println("El mayor de los numeros es:"+ Math.max(x.getNum1(), x.getNum2()));
    }
    
//    Método calcularPotencia para calcular la potencia 
//            del mayor valor de la clase elevado 
//                    al menor número. Previamente se deben redondear ambos valores.
    public void calcularPotencia(ParDeNumeros d){
        double max=Math.max(d.getNum1(), d.getNum2());
        System.out.println("El numero mayor es: "+max);
        if (max==d.getNum1()){
           System.out.println("La potencia entre el primer numero elevado al segundo es: "+Math.pow(Math.floor(d.getNum1()), Math.floor(d.getNum2())));
        }else{
            System.out.println("La potencia entre el segundo numero elevado el primero: "+ Math.pow(Math.floor(d.getNum2()), Math.floor(d.getNum1())));
        }
    }
    
//    Método calculaRaiz, para calcular la raíz cuadrada del 
//            menor de los dos valores. 
//            Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    
    public void calcularRaiz(ParDeNumeros d){
        double min=Math.min(d.getNum1(), d.getNum2());
        min=Math.abs(min);
        
        System.out.println("La raiz cuadrada del menor de los numeros es: " + Math.sqrt(min));
    }

    
}
