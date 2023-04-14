/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *Ejercicio1
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 * @author dgalm
 */
public class Fracciones {
    private double num1;
    private double den1;
    private double num2;
    private double den2;

    public Fracciones() {
    }

    public Fracciones(double num1, double den1, double num2, double den2) {
        this.num1 = num1;
        this.den1 = den1;
        this.num2 = num2;
        this.den2 = den2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getDen1() {
        return den1;
    }

    public void setDen1(double den1) {
        this.den1 = den1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getDen2() {
        return den2;
    }

    public void setDen2(double den2) {
        this.den2 = den2;
    }

    public void sumarFraccion() {
        if (this.den1 == this.den2) {
            double numR = this.num1 + this.num2;
            System.out.println("EL RESULTADO DE LA SUMA DE LAS FRACCIONES ES: " + numR / den2);
        } else {
            double mcm = mcm();
            double auxN1 = (mcm / this.den1 * this.num1);
            double auxN2 = (mcm / this.den2 * this.num2);
            System.out.println("EL RESULTADO DE LA SUMA DE LAS FRACCIONES ES: " + (auxN1 + auxN2) + "/" + mcm + " es: " + (auxN1 + auxN2) / mcm);
        }
    }
       public void restarFraccion() {
        if (this.den1 == this.den2) {
            double numR = this.num1 - this.num2;
            System.out.println("EL RESULTADO DE LA RESTA DE LAS FRACCIONES ES: " + numR / den2);
        } else {
            double mcm = mcm();
            double auxN1 = (mcm / this.den1 * this.num1);
            double auxN2 = (mcm / this.den2 * this.num2);
            System.out.println("EL RESULTADO DE LA RESTA DE LAS FRACCIONES ES: " + (auxN1 - auxN2) + "/" + mcm + " es: " + (auxN1 - auxN2) / mcm);
        }
    }
    public void multiplicacion(){
        System.out.println("EL RESULTADO DE LA MULTIPLICACION DE FRACCIONES ES: " + (this.num1*this.num2)+"/"+(this.den1*this.den2));
    }
       public void division(){
        System.out.println("EL RESULTADO DE LA DIVISION DE FRACCIONES ES: " + (this.num1*this.den2)+"/"+(this.num2*this.den1));
    }
    
    

    public double mcm() {
        double a = Math.max(this.den1, this.den2);
        double b = Math.min(this.den1, this.den2);
        double resultado = (a / mcd(this.den1, this.den2)) * b;
        return resultado;

    }

    public double mcd(double c, double d) {

        double a = Math.max(c, d);
        double b = Math.min(c, d);
        double resultado = 0;
        do {
            resultado = b;
            b = a % b;
            a = resultado;
        } while (b != 0);
        return resultado;

    }
}


//public class Fraccion {
//    public int n1, d1,n2, d2;
//    
//    
//    public void sumar(int n1, int d1,int n2, int d2){
//        
//        int num, den, res=0;
//        
//        num=(n1*d2)+(n2*d1);
//        den=d1*d2;
//        if (num%den==0){
//            res=num/den;
//            System.out.println("la fraccion simplificada da: "+res);
//        }else{
//             System.out.println(num+"/"+den);
//        }
//       
//        
//    }
//    
//    
//}