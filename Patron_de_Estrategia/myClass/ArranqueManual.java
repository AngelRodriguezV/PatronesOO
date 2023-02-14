package Patron_de_Estrategia.myClass;

/**
 * Clase para la estrategia de Arranque Manual
 */
public class ArranqueManual implements Arranque {

    @Override
    public String arrancar() {
        return "Ingresa la llave.\n Gira la llave.\n Pisa clutch.\n Mete primera.\n Arranca.";
    }

}