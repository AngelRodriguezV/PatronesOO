package Patron_de_Estrategia.myClass;

/**
 * Clase Automovil Manual
 */
public class AutomovilManual extends Vehiculo {

    /**
     * Metodo constructor
     * @param nombre
     */
    public AutomovilManual(String nombre) {
        super(nombre);
        super.arranque = new ArranqueManual();
    }

}