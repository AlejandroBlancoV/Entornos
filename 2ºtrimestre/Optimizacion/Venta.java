
/**
 * clase que permite calcular el coste de una venta
 * 
 * @author ALejandro
 * @version 1.0
 */
abstract class Cliente {
    /** Nombre del cliente que realiza la compra */
    String nombre;
    /** Determina si un cliente es también empleado */
    boolean esEmpleado;
    /** Determina si el cliente posee cupón gratuito */
    boolean tieneCuponGratis;

}

class clienteGold extends Cliente {

}

class clientePlatinum extends Cliente {

}

class clienteNormal extends Cliente {

}

public class Venta {
    /** descuento de la venta */
    float coste, descuento;
    Cliente cliente;

    private boolean isFree() {
        return (cliente.esEmpleado ||
                cliente instanceof clienteGold ||
                cliente instanceof clientePlatinum ||
                cliente instanceof clienteNormal);

    }

    /**
     * metodo que calcula el total con descuento de la venta
     * 
     * @return el valor del total con descuento
     */
    float calculaCosteTotal() {

        return isFree() ? 0 : coste * (1 - descuento);
    }

    // Ampliacion
    /*
     * Como los precios son muy caros algunos clientes prefieren pagar el producto
     * dentro
     * de unos meses. Crea una funcion que permita evaluar el coste total
     * -Especificando la cantidad de meses y
     * - la tasa de interés que se va a aplicar
     * (usa la fórmula del interés simple)
     */
    /**
     * Clacula el coste total en meses
     * 
     * @param meses tiempo en meses
     * @param tasa  tasa a aplicar
     * @return el coste con intereses aplicados
     */
    float calcularCosteConIntereses(int meses, float tasa) {
        return calculaCosteTotal() * tasa * meses + 1;
    }
}
