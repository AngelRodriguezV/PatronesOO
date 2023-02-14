package Patron_de_Estrategia.myClass;


public class VelocidadCohete extends Velocidad {

    public VelocidadCohete(double velocidad_inicial, double tiempo) {
        super(tiempo, velocidad_inicial);
    }

    @Override
    public double calcularVelocidad() {
        return velocidad_inicial + (9.8 + tiempo);
    }
}