package Examen2aEvaluacionEntornos;

/*Creo la clase Hechizo que extiende de Hechizero porque para conocer
 * si se puede lanzar un hechizo necesita saber los atributos de su hechizero.
 * 
 * En esta clase introduzco los atributos propios de hechizo y sus funciones, para posteriormente 
 * definir cada tipo de hechizo en una clase nueva.
 * 
 * La funcion de calcular el daño termina usándose solo para los casos donde el tipo de
 * hechizo no se defina, con su valor por defecto anterior que era 0.
 * 
 * En la funcion de puedeLanzarHechizo he cambiado el nombre para usar un mismo patrón
 * en todas las clases, en este caso camelCase, y en la función se recurre a un atributo de la
 * clase hechizero de la cual es heredero.
 */
class Hechizo extends Hechizero {
    String nombre = "default"; // nombre del hechizo
    String descripcion; // Breve descripción del hechizo
    private boolean preparado = true; // Determina si está preparado para lanzar el
    // hechizo

    boolean puedeLanzarHechizo() {
        if (preparado) {
            if (manaHechizero > 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // Calcula el daño de una carta
    float calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca() {
        return 0;
    }

    /*
     * En el main hago pequeños cambios para adaptarlo al nuevoe esquema de clases,
     * de esta forma defino el tipo de hechizo al crearlo
     * y ya no tengo que usar un switch para generar su daño, ya que eso se
     * especifica
     * en su clase correspondiente.
     * 
     * Finalmente la prueba en el main es con el mismo tipo que antes: Embrujo
     * con lo cual solo tuve que quitar la línea donde especificaba su tipo, ya que
     * se define previamente
     */
    public static void main(String[] args) {
        Hechizo c = new Embrujo();
        c.nivelHechizero = 2;
        c.destrezaHechizero = 3;
        c.manaHechizero = 10;
        System.out.println(c.calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca());
    }
}

/*
 * Creo las clases correspondientes a cada uno de los tipos de hechizo e
 * introduzco
 * la funcion que devuelve el daño que realiza, de forma que cada una tenga el
 * suyo propio, el resto de atributos son heredados de Hechizo mediante extends,
 * así mantienen la capacidad de poder alterar sus atributos y de generar el
 * daño
 * que corresponde a cada tipo
 */
class Transformacion extends Hechizo {
    @Override
    float calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca() {
        return nivelHechizero * 2 + destrezaHechizero;
    }
}

class Encantamiente extends Hechizo {
    @Override
    float calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca() {
        return nivelHechizero * 1 + destrezaHechizero;
    }
}

class Embrujo extends Hechizo {
    @Override
    float calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca() {
        return nivelHechizero / 2 + destrezaHechizero;
    }
}

class Malefico extends Hechizo {
    @Override
    float calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca() {
        return nivelHechizero * 2;
    }
}
