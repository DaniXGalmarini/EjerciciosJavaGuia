/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad.RaicesServicios;

import entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author ovied
 */
public class RaicesServicios {

    Scanner leer = new Scanner(System.in);

    public double getDiscriminante(Raices a) {
        return (Math.pow(a.getB(), 2) - 4 * a.getA() * a.getC());
    }

    public boolean tieneRaices(Raices r) {
        return getDiscriminante(r) >= 0;
    }

    public boolean tieneRaiz(Raices r) {
        return getDiscriminante(r) == 0;
    }

    public void obtenerRaices(Raices x) {
        if (tieneRaices(x)) {
            System.out.println("La primer solucion es: " + (-x.getB()+Math.sqrt(getDiscriminante(x))) / (2*x.getA()));
            System.out.println("La segunda solucion es: " + (-x.getB()-Math.sqrt(getDiscriminante(x))) / (2*x.getA()));
        }
    }

    public void obtenerRaiz(Raices x) {
        if (tieneRaiz(x)) {
            System.out.println("La solucion es: " + (-x.getB()+Math.sqrt(getDiscriminante(x))) / (2*x.getA()));
        }
    }

    public void calcular(Raices r) {
        if (tieneRaices(r)) {
            System.out.println("La ecuacion tiene 2 soluciones");
            System.out.println("Desea verlas?S/N");
            String opcion2 = leer.next();
            if (opcion2.equals("S")) {
                obtenerRaices(r);
            }
        } else if (tieneRaiz(r)) {
            System.out.println("La ecuacion tiene 1 solucion");
            System.out.println("Desea verla?S/N");
            String opcion2 = leer.next();
            if (opcion2.equals("S")) {
                obtenerRaiz(r);
            }
        } else {
            System.out.println("La ecuacion no tiene solucion");
        }
    }
}
