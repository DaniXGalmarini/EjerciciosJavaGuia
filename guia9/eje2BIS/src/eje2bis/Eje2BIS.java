/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2bis;

import Entidad.ParDeNumeros;
import Servicios.ParDeNumerosService;

/**
 *
 * @author dgalm
 */
public class Eje2BIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ParDeNumerosService ps= new ParDeNumerosService();
       ParDeNumeros p1=new ParDeNumeros();
       
       ps.mostrarValores(p1);
       ps.devolverMayor(p1);
       ps.calcularPotencia(p1);
       ps.calcularRaiz(p1);
       
    }
    
}
