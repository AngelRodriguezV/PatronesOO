package Patron_de_Estrategia.tests;

import Patron_de_Estrategia.myClass.*;

/**
 * Primera prueba de la Implementacion del Patron Estrategia
 * Prueba de la estrategia Manual
 */
public class test1 {

    /**
     * Ejecucion de la prueba
     */
    public static void main(String[] args) {
        Vehiculo v1 = new AutomovilManual(0);

        System.out.print(v1.arrancar());
    }
}
