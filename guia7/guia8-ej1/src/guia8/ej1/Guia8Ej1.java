/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ej1;

import Entidad.CuentaBancaria;
import Entidad.Servicios.CuentaBancariaServicios;



/**
 *
 * @author dgalm
 */
public class Guia8Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     CuentaBancariaServicios sm=new CuentaBancariaServicios();
     
     CuentaBancaria c1=sm.crearCuenta();
     
     CuentaBancaria [] cuenta = new CuentaBancaria[4];
        
        cuenta[1]=sm.crearCuenta();
     
     
     
     sm.ingresarSaldo(c1);
     sm.retirarSaldo(c1);
    sm.retiroRapido(c1);
     
       
          System.out.println(c1.getNumeroCuenta());
        System.out.println(c1.getDniCliente());
        System.out.println(c1.getSaldoActual());
        
      
 
    }
    
}
