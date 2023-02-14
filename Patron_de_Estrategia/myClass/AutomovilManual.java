package Patron_de_Estrategia.myClass;

/**
 * Clase Automovil Manual
 */
public class AutomovilManual extends Vehiculo {
    
    /**
     * Metodo constructor
     * @param idVeh
     */
    public AutomovilManual(int idVeh) {
        super(idVeh);
        super.arranque = new ArranqueManual();
    }

}