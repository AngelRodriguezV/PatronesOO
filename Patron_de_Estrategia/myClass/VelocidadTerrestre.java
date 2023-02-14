package Patron_de_Estrategia.myClass;

public class VelocidadTerrestre extends Velocidad{

    private double distancia;
    
    public VelocidadTerrestre (double velocidad_inicial, double tiempo, double distancia) {
        super(tiempo, velocidad_inicial);
        this.distancia = distancia;
    }

    @Override
    public double calcularVelocidad() {
        return (velocidad_inicial + distancia / tiempo) / 2;
    }
}
