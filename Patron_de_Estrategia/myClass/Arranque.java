package Patron_de_Estrategia.myClass;

/**
 * Clase abstracta para la Estrategia Arranque
 */
public abstract class Arranque {

    /**
     * Este metodo arranca un Vehiculo
     * @return Regresa una cadena del arranque
     */
    public String arrancar() {
        return "arranca el vehiculo";
    }

}