package Patron_de_Estrategia.tests;

import Patron_de_Estrategia.myClass.*;

/**
 * Tests para probar la modularidad de las estrategias
 */

public class test3 {

    public void run_test() {
        Vehiculo v3 = new AutomovilManual("Bugati xD");

        System.out.println("Utilizando la estrategia por defecto del Automovil Manual");
 
        System.out.println(v3.arrancar());

        System.out.println("\n Cambiamos la estrategia a automoatico");

        Arranque a1 = new ArranqueAutomatico();

        v3.setComportamiento(a1);

        System.out.print(v3.arrancar());
    }

    /**
     * Ejecutamos la prueba
     */
    public static void main(String[] args) {
        test3 test = new test3();
        test.run_test();
    }
}
