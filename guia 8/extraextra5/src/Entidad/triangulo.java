/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *Definir una clase triangulo que modelara triángulos isósceles . 
 * Definir los atributos necesarios para
operar. 

 * @author dgalm
 */
public class triangulo {
    
    private double base;
    private double altura;

    public triangulo() {
    }

    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
}
