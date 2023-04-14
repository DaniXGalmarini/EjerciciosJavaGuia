/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????

 * @author dgalm
 */
public class Tiempo {
    int hora, min, seg;

    public Tiempo() {
    }

    public Tiempo(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }
    
    public void crearHora(){
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese hora");
            this.hora = leer.nextInt();

        } while (this.hora > 24 || this.hora < 0);

        do {
            System.out.println("Ingrese minutos");
            this.min = leer.nextInt();

        } while (this.min > 59 || this.min < 0);
        do {
            System.out.println("Ingrese segundos");
            this.seg = leer.nextInt();

        } while (this.seg > 59 || this.seg < 0);

    }

    public void imprimirHoraCompleta() {
        for (int i = this.hora; i <25; i++) {

            for (int j = this.min; j < 60; j++) {

                for (int k = this.seg; k < 60; k++) {
                    System.out.println(this.hora + ":" + this.min + ":" + this.seg);
                    this.seg++;
                    delaySegundo();
                }
                this.seg = 0;
                this.min++;

            }
            this.min = 0;
            this.hora++;
            if (this.hora == 24) {
                this.hora = 0;
            }
        }
 

    }
    
    private void delaySegundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

    }
}
