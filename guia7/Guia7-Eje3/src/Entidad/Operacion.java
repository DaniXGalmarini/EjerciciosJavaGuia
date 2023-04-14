/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class Operacion {
    
    private int num1;
    private int num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);        
        System.out.println("Ingrese el primer numero a calcular");
        this.num1=leer.nextInt();
        System.out.println("Ingrese el segundo numero a calcular");
        this.num2=leer.nextInt();
    }
    
    public void sumar(){
        int suma=this.num1+this.num2;
        System.out.println("La suma de los numeros ingresados es: "+suma);
    }
    
    public void restar(){
        int resta=this.num1-this.num2;
        System.out.println("La resa de los numeros ingresados es: "+ resta);
    }
    
    public void multiplicar(){
        if (this.num2!=0 || this.num1!=0){
            int multiplicacion=this.num1*this.num2;
            System.out.println("La multiplicacion de los numeros ingresados es: "+multiplicacion);
        } else {
            System.out.println("El resultado es 0");
        }
        
    }
    
    public void dividir(){
           if (this.num2!=0){
            double numero1=this.num1;
            double numero2=this.num2;
            double division=numero1/numero2;
            System.out.println("La multiplicacion de los numeros ingresados es: "+division);
        } else {
            System.out.println("NO SE PUEDE DIVIDIR POR 0");
        }
        
    }
    
    
}
