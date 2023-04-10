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
public class Juego {

    int num;

    public Juego() {
    }

    public Juego(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void iniciarJuego() {
        int option = 0;
        Scanner leer = new Scanner(System.in);

        int intentos = 0, contG1 = 0, contG2 = 0;
        do {
  System.out.println("Ingrese numero a adivinar");
                this.num = leer.nextInt();
            do {
              
                System.out.println("Ingrese numero");
                int num2 = leer.nextInt();
                if (this.num == num2) {
                    System.out.println("FELICITACIONES");
                    contG2++;
                    break;
                } else {
                    if (this.num < num2) {
                        System.out.println("El numero es mas bajo");
                        intentos++;
                    } else {
                        System.out.println("El numero es mas alto");
                        intentos++;
                    }
                }
            } while (intentos != 5);
            if (intentos == 5) {
                System.out.println("El jugador 1 es el ganador " + contG1 + " partidas ganadas");
            } else {
                System.out.println("El jugador 2 es el ganador " + contG2 + " partidas ganadas");
            }
            System.out.println("Desea seguir jugando? 1/0");
            option = leer.nextInt();
        } while (option == 0);
        
        
    }
}
