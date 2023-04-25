/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1bis;

import Servicios.CadenaServicio;

/**
 *
 * @author dgalm
 */
public class Ejer1bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio cs=new CadenaServicio();
        cs.mostrarVocales();
        //cs.compararLongitud("la casa es linda");
        //cs.compararLongitud("hola");
        cs.compararLongitud("holadfsfdgfdgfdgfdgdgdgfdgfdgfdgfdgfdgfd");
        
        cs.invertirFrase();
        cs.vecesRepetido();
        cs.unirFrases(" y grande");
        cs.contiene("l");
        cs.reemplazar("***");
        
        
    }
    
}
