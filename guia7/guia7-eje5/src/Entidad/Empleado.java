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
public class Empleado {
    String nombre;
    int edad;
    double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double calcular_aumento() {
        if (this.edad >= 30) {
            this.salario = this.salario + (this.salario * 10 / 100);
        } else {
            this.salario = this.salario + (this.salario * 5 / 100);
        }
        return this.salario;
      
    }
}

