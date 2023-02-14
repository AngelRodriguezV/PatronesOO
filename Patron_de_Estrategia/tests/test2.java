package Patron_de_Estrategia.tests;

import Patron_de_Estrategia.myClass.*;


/**
 * Segunda prueba de la implementacion estrategia
 * Prueba de la estrategia Automatica
 */
public class test2 {

    /**
     * Ejecucion de la prueba
     */
    public static void main(String[] args) {
        Vehiculo v2 = new AutomovilAutomatico(0);

        System.out.print(v2.arrancar());
    }
}
