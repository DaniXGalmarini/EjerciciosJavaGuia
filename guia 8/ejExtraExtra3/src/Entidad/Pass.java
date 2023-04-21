/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author dgalm
 */
public class Pass {
    private String passw;
    private String nombre;
    private int dni;

    public Pass() {
    }

    public Pass(String passw, String nombre, int dni) {
        this.passw = passw;
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getPass() {
        return passw;
    }

    public void setPass(String pass) {
        this.passw = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Pass{" + "passw=" + passw + ", nombre=" + nombre + ", dni=" + dni + '}';
    }
    
   
}
