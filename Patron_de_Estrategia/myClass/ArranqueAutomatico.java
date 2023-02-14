package Patron_de_Estrategia.myClass;

/** 
 * Clase para la Estrategia del Arranque Automatico
 */
public class ArranqueAutomatico implements Arranque {

    @Override
    public String arrancar() {
        return "Ingresa la llave.\n Gira la llave.\n Se enciende.\n Pisa el acelerador.\n Arranca.";
    }

}