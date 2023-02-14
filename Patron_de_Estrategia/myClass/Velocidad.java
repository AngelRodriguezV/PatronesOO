package Patron_de_Estrategia.myClass;

public abstract class Velocidad {
    protected double tiempo;
    protected double velocidad_inicial;

    public Velocidad(double t, double vi) {
        this.tiempo = t;
        this.velocidad_inicial = vi;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getVelocidad_inicial() {
        return velocidad_inicial;
    }

    public void setVelocidad_inicial(double velocidad_inicial) {
        this.velocidad_inicial = velocidad_inicial;
    }

    public double calcularVelocidad() {
        return velocidad_inicial + tiempo;
    }
}
