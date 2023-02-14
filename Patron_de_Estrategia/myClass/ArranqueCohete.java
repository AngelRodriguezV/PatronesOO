package Patron_de_Estrategia.myClass;

public class ArranqueCohete implements Arranque{

    @Override
    public String arrancar() {
        return "Preparacion de Ignición\n 1..\n 2..\n 3...\n Despegue";
    }

}