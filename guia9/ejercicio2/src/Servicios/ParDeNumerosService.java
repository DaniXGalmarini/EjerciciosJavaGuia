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
    
    public void mostarValores(ParDeNumeros x){
        System.out.println("Los numeros aleatorios son: \n"+ x.getNum1()+"\n"+x.getNum2());
    }
    
    public double devolverMayor(ParDeNumeros x){
        return Math.max(x.getNum1(), x.getNum2());
    }
    
    public void calcularPotencia(ParDeNumeros x){
             double a=(Math.round((x.getNum1() * 100) / 100));
        double b=(Math.round((x.getNum2() * 100) / 100));
        if (x.getNum1()==devolverMayor(x)){
       
        System.out.println("La potencia de los numeros "+x.getNum1()+" elevada al numero: "+x.getNum2()+" es: "+Math.pow(a, b));
        }else{  System.out.println("La potencia de los numeros "+x.getNum2()+" elevada al numero: "+x.getNum1()+" es: "+Math.pow(b, a));
        }
    }     
        public void calcularRaiz(ParDeNumeros x){
            double menor=Math.min(x.getNum1(), x.getNum2());
            menor=Math.abs(menor);
            System.out.println("el numero absoluto es "+ menor);
            System.out.println("LA RAIZ CUADRADA DEL MENOR DE LOS VALORES ES: "+ Math.sqrt(menor));
        }
    }

