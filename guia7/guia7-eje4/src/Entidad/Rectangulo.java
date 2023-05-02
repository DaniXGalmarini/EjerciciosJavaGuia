/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author dgal
 */
public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void CalculaSuperficie(){
       int superficie=this.base*this.altura;
        System.out.println("La superficie es: "+ superficie);
    }

    public void CalcularPerimetro(){
        int perimetro=(this.base+this.altura)*2;
        System.out.println("El perimetro es: "+ perimetro);
    }
    
    public void Dibujar(){
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
            
        }
   public void limpiarpantalla() throws AWTException {
    Robot robot = new Robot();
    
    robot.delay(1100);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_L);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyRelease(KeyEvent.VK_L);
}
}
