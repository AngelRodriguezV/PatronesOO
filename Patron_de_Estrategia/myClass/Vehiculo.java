package Patron_de_Estrategia.myClass;

/** 
 * Clase Abstracta para Vehiculos, funge como contexto
*/
public abstract class Vehiculo {
    protected String nombre;
    protected Arranque arranque;
    protected Velocidad velocidad;

    /**
     * Metodo constructor
     * @param idVehiculo
     */
    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este metodo remplaza el arranque con un nuevo arranque
     * @param arranque
     */
    public void setComportamiento(Arranque arranque) {
        this.arranque = arranque;
    }

    /**
     * Este metodo llama al arranque del vehiculo
     * @return Regresa una cadena de la ejecución de arranque
     */
    public String arrancar() {
        return arranque.arrancar();
    } 

    /**
     *  Este metodo calcula la velocidad del vehiculo
     * @return Regresa el resultado de calcular la velocidad
     */
    public double calVelocidad() {
        return velocidad.calcularVelocidad();
    }
}