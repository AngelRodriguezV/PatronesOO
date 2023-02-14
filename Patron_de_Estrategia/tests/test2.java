package Patron_de_Estrategia.tests;

import Patron_de_Estrategia.myClass.*;


/**
 * Segunda prueba de la implementacion estrategia
 * Prueba de la estrategia Automatica
 */
public class test2 {

    public void run_test() {
        Vehiculo v2 = new AutomovilAutomatico("lamborghini");

        System.out.print(v2.arrancar());
    }
    
    /**
     * Ejecucion de la prueba
     */
    public static void main(String[] args) {
        test2 test = new test2();
        test.run_test();
    }
}