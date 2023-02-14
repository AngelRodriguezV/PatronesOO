package Patron_de_Estrategia.tests;

import Patron_de_Estrategia.myClass.*;

/**
 * Primera prueba de la Implementacion del Patron Estrategia
 * Prueba de la estrategia Manual
 */
public class test1 {

    public void run_test() {
        Vehiculo v1 = new AutomovilManual("Suru Tuneado");

        System.out.print(v1.arrancar());
    }

    /**
     * Ejecucion de la prueba
     */
    public static void main(String[] args) {
        test1 test = new test1();
        test.run_test();
    }
}