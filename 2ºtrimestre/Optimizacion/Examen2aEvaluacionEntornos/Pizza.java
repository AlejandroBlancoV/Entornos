package Examen2aEvaluacionEntornos;

import java.util.ArrayList;

class Ingrediente {
    private String nombre;
    private float precio;

    public Ingrediente(String nombre, float precio) {
        super();
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}

/**
 * Clase que nos permite crear una pizza añadiendo y quitando ingredientes, y
 * finalmente calcular su precio
 * 
 * @author Alejandro
 * @version 1.0
 */
public class Pizza {
    /**
     * Precio base de la pizza sin contar ingredientes
     */
    final static float PRECIO_BASE = 5;
    /**
     * Creamos una lista de ingredientes para almacenarlos
     */
    private ArrayList<Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();

    /**
     * Funcion que devuelve la cantidad de ingredientes de la pizza
     * 
     * @return la cantidad de ingredientes implementados
     */
    public int getCantidadIngredientes() {
        return listaIngredientes.size();
    }

    /**
     * Funcion que calcula el coste de la pizza contando los ingredientes y el
     * precio base
     * 
     * @return el coste total de la pizza
     */
    public float getCostePizza() {
        float coste = PRECIO_BASE;
        for (Ingrediente i : listaIngredientes) {
            coste += i.getPrecio();
        }
        return coste;
    }

    /**
     * Funcion que añade ingredientes a la pizza
     * 
     * @param bola ingrediente que le pasamos a la función para ser añadido
     */
    public void addIngrediente(Ingrediente bola) {
        listaIngredientes.add(bola);
    }

    /**
     * Funcion que quita ingredientes de la pizza
     * 
     * @param bola ingrediente que pasamos a la funcion parar ser eliminado
     */
    public void quitarIngrediente(Ingrediente bola) {
        listaIngredientes.remove(bola);
    }

    /**
     * Funcion que elimina todos los ingredientes registrados previamente
     */
    public void quitarTodosLosIngredientes() {
        listaIngredientes.clear();
    }

    /**
     * Funcion que devuelve la lista de ingredientes en forma de cadena
     * 
     * @deprecated la funcón está en desuso actualmente
     * @return una cadena con todos los ingredientes
     */
    public String obtenerIngredientesFormatoTexto() {
        String resultado = "";
        for (Ingrediente i : listaIngredientes) {
            resultado += i.getNombre();
            resultado += "\n";
        }
        return resultado;
    }

    /**
     * Funcion que devuelve la lista de ingredientes como cadena de texto
     * 
     * @return la lista de los ingredientes en forma de cadena de texto
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Ingrediente i : listaIngredientes) {
            sb.append(i.getNombre());
            sb.append("\n");
        }
        return sb.toString();
    }
}
