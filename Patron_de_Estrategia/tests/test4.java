package Patron_de_Estrategia.tests;

import Patron_de_Estrategia.myClass.*;

public class test4 {
    
    public void run_test() {
        Velocidad vCohete = new VelocidadCohete(5, 10);

        Vehiculo myCohete = new Cohete("Apolo18");

        myCohete.setVelocidad(vCohete);

        System.out.println(myCohete.calVelocidad());
    }


    public static void main(String[] args) {
        test4 test = new test4();
        test.run_test();
    }
}
