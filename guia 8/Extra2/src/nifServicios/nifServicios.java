/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nifServicios;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class nifServicios {
    Scanner leer = new Scanner(System.in);    
    public void crearNIF(NIF x){
        char [] letra= new char [23];
        letra[0]='T';
        letra[1]='R';
        letra[2]='W';
        letra[3]='A';
        letra[4]='G';
        letra[5]='M';
        letra[6]='Y';
        letra[7]='F';
        letra[8]='P';
        letra[9]='D';
        letra[10]='X';
        letra[11]='B';
        letra[12]='N';
        letra[13]='J';
        letra[14]='Z';
        letra[15]='S';
        letra[16]='Q';
        letra[17]='V';
        letra[18]='H';
        letra[19]='L';
        letra[20]='C';
        letra[21]='K';
        letra[22]='E';
        System.out.println("Ingrese DNI:");
        x.setDni(leer.nextLong());
        long calculo=x.getDni()%23;
        for (int i = 0; i < 22; i++) {
            if (calculo==i){
                x.setLetra(letra[i]);
            }         
        }

    }

    public void mostrar(NIF a) {
        System.out.println(a.getDni() + "-" + Character.toUpperCase(a.getLetra()));
    }

    public void crearnif2(NIF x) {
        char[] lista = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        System.out.println("Ingrese DNI:");
        x.setDni(leer.nextLong());
        int calculo = (int) (x.getDni()) % 23;
        //int o =(int)(long)calculo;
        x.setLetra(lista[calculo]);

    }
    
    
    
    
    
    
}

