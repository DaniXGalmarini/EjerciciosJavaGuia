/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraextra5;

import Entidad.triangulo;
import Servicios.trianguloServicio;

/**
 *
 * @author dgalm
 */
public class Extraextra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        trianguloServicio ts = new trianguloServicio();

        triangulo[] tv = new triangulo[4];
        tv[0] = new triangulo(2, 8);
        tv[1] = new triangulo(1, 7);
        tv[2] = new triangulo(4, 25);
        tv[3] = new triangulo(6, 12);

        ts.calcular(tv);

        for (int i = 0; i < tv.length; i++) {
            System.out.println("El perimetro del triangulo "+ i+ " es: "+ts.perimetro(tv[i]));

        }

        for (int i = 0; i < tv.length; i++) {
            System.out.println("El area del triangulo "+ i+ " es: "+ts.area(tv[i]));

        }
    }

}
