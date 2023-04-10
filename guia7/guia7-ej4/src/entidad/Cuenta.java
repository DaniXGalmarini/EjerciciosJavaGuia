/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Cuenta {
    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
   public void retirar_dinero(double pedido){
       Scanner leer = new Scanner(System.in);       
       if(this.saldo>pedido){
           this.saldo=this.saldo-pedido;
           System.out.println("Transaccion exitosa. Su saldo actual es: "+this.saldo);
       }else{
       do{
           System.out.println("Su saldo es: "+this.saldo+" .Ingrese una cantidad menor");
           pedido=leer.nextDouble();
       }while (this.saldo<pedido);
       
         this.saldo=this.saldo-pedido;
           System.out.println("Transaccion exitosa. Su saldo actual es: "+this.saldo);
            
   }
       }
    
}
