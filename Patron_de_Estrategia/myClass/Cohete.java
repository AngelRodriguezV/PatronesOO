package Patron_de_Estrategia.myClass;

/**
 * Clase Cohete
 */
public class Cohete extends Vehiculo {

    /**
     * Constructor
     * @param nombre
     */
    public Cohete(String nombre) {
        super(nombre);
        super.arranque = new ArranqueCohete();
    }

}