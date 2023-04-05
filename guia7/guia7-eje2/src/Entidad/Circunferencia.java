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
public class Circunferencia {
    private double radio;
    
    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);        
        System.out.println("Ingrese el valor del radio");
        this.radio=leer.nextDouble();
    }
    
    public void area(){
        double area=Math.PI*(Math.pow(this.radio, 2));
        System.out.println("El area es: "+area);
    }    
    public void perimetro(){
        double perimetro=Math.PI*this.radio*2;
        System.out.println("El preimetro es: "+perimetro);
    }
}
