/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4;

import Servicios.FechaService;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author dgalm
 */
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService fs=new FechaService();
        Date fechaN= fs.fechaNacimiento();
        Date fechaAct=fs.fechaActual();
        fs.diferencia(fechaN, fechaAct);
        
        
    }
    
}
