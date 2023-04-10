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
public class Puntos {
    double x1;
    double x2;
    double y1;
    double y2;

    public Puntos() {
    }

    public Puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    public void cargarPuntos(){
            Scanner leer = new Scanner(System.in);            
            System.out.println("INGRESE LA COORDENADA X DEL PRIMER PUNTO");
            this.x1=leer.nextDouble();
            System.out.println("INGRESE LA COORDENADA Y DEL PRIMER PUNTO");
            this.y1=leer.nextDouble();
            System.out.println("--------------------------------------------");
            System.out.println("--------------------------------------------");
            System.out.println("INGRESE LA COORDENADA X DEL SEGUNDO PUNTO");
            this.x2=leer.nextDouble();
            System.out.println("INGRESE LA COORDENADA Y DEL SEGUNDO PUNTO");
            this.y2=leer.nextDouble();
}
    public void distancia(){
        double distancia=Math.sqrt((Math.pow((this.x2-this.x1), 2))+Math.pow((this.y2-this.y1), 2));
        System.out.println("La distancia entre los puntos es: "+distancia);
    }
    
    
    public void mostrar() {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                if (i == this.x1 - 1) {
//                    if (j == this.y1 - 1) {
//                        System.out.print("* ");
//                    } else {
//                        System.out.print("- ");
//                    }
//
//                } else {
//                    System.out.print("- ");
//                }
//
//            }
//            System.out.println("");
//        }
//        
//    }
    String [][] matriz= new String[10][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=" - ";                
            }
            
        }
        matriz[(int) this.x1-1][(int)this.y1-1]=" * ";
        matriz[(int) this.x2-1][(int) this.y2-1]=" * ";
    
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
                
            }
            System.out.println("");
        }
    
    }
    
}