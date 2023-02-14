package Patron_de_Estrategia.myClass;

/**
 * Clase Automovil Automatico
 */
public class AutomovilAutomatico extends Vehiculo {

    /**
     * Metodo constructor 
     * @param idVeh
     */
    public AutomovilAutomatico(int idVeh) {
        super(idVeh);
        super.arranque = new ArranqueAutomatico();
    }

}