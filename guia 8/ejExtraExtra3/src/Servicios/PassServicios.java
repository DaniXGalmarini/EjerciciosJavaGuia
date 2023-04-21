/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Pass;
import java.util.Scanner;

/**
 *
 * @author dgalm
 */
public class PassServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");    
    public void crearPass(Pass x){
    String contrasena;   
        do{
             System.out.println("Ingrese una contraseña:");
             contrasena=leer.next();
        }while (contrasena.length()!=10);
        x.setPass(contrasena);        
    }
    
    public void analizarPass(Pass x){
        int conta=0;
        int contz=0;
        for (int i = 0; i < x.getPass().length(); i++) {
            if (x.getPass().substring(i, i+1).equals("a")){
                conta++;
            }else  if (x.getPass().substring(i, i+1).equals("z")){
                contz++;
            }    
        }
        if (conta>=2 && contz>=1){
            System.out.println("La contraseña es nivel ALTO");
        }else if (contz>=1 && conta<=1){
            System.out.println("La contraseña es de nivel MEDIO");
        }else {
            System.out.println("La contraseña es de nivel BAJO");
        }
    }
    
    public void modificarNombre(Pass x){
       String contrasena;
        do{
        System.out.println("Para modificar, ingrese su contraseña");
        contrasena=leer.next();
        
    }while (!contrasena.equals(x.getPass()));
    
        System.out.println("Ingrese un nuevo Nombre:");
        x.setNombre(leer.next());
      
    }
    
    public void modificarDni(Pass x){
       String contrasena;
        do{
        System.out.println("Para modificar, ingrese su contraseña");
        contrasena=leer.next();
     
    }while (!contrasena.equals(x.getPass()));
    
        System.out.println("Ingrese un nuevo DNI");
        x.setDni(leer.nextInt());
    }
    
       public void modificar(Pass x, int a){
       String contrasena;
        do{
        System.out.println("Para modificar, ingrese su contraseña");
        contrasena=leer.next(); 
    }while (!contrasena.equals(x.getPass()));
        if (a==1){
            System.out.println("Ingrese un nuevo Nombre:");
        x.setNombre(leer.next());
        }else if (a==2) {
            System.out.println("Ingrese un nuevo DNI");
        x.setDni(leer.nextInt());
        } 
    }
    
       
       
    public void modificarPass(Pass x) {
        String contrasena;
        do {
            System.out.println("Para modificar, ingrese su contraseña");
            contrasena = leer.next();
        } while (!contrasena.equals(x.getPass()));
        
        
        System.out.println("Ingrese su nueva contraseña");
        crearPass(x);
    }
}
