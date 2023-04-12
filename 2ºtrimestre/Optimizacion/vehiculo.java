
interface volable {
    default void volar() {

    }
}

abstract public class vehiculo {
    String nombre;
    float potencia;
    float peso;

    float getconsumo() {
        return potencia * peso;
    }

}

class avion extends vehiculo implements volable {

}

class avioneta extends vehiculo implements volable {

}
