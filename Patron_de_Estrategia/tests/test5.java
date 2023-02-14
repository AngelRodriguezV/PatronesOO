package Patron_de_Estrategia.tests;

import Patron_de_Estrategia.myClass.*;

public class test5 {
    
    public void run_test() {
        Velocidad v = new VelocidadTerrestre(5, 10, 100);

        Vehiculo myAuto = new AutomovilManual("Suru GOD");

        myAuto.setVelocidad(v);

        System.out.println(myAuto.calVelocidad());
    }


    public static void main(String[] args) {
        test5 test = new test5();
        test.run_test();
    }
}
