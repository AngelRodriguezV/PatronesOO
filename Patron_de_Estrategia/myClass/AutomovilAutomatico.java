package Patron_de_Estrategia.myClass;

/**
 * Clase Automovil Automatico
 */
public class AutomovilAutomatico extends Vehiculo {

    /**
     * Metodo constructor 
     * @param nombre
     */
    public AutomovilAutomatico(String nombre) {
        super(nombre);
        super.arranque = new ArranqueAutomatico();
    }

}