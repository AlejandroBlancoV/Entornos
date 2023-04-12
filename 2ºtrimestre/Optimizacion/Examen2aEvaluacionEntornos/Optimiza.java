package Examen2aEvaluacionEntornos;

public class Optimiza {
    String frutas[] = { "platano", "fresa", "pomelo", "limon", "naranja", "pera" };

    /* Este método busca si una fruta está en la lista de frutas */
    /*
     * He eliminado los boolean siEsta noEsta, y los he substituído por los return
     * para que devuelva
     * directamente true o false sin depender de variables extra, que ocupan en
     * memoria y no son útiles
     */
    boolean busca(String frutaABuscar) {
        for (String fruta : frutas) {
            if (fruta.equals(frutaABuscar)) {
                return true;
            }
        }
        return false;
    }

    // Función que determine si hay alguna fruta repetida en la lista
    /*
     * He añadido la variable tamaño que precalcula la longitud de frutas para
     * ahorrar tiempo y que la función no calcule ese dato a cada paso del bucle, si
     * no
     * que solo tenga que acceder a la memoria, lo cual es mas veloz
     */
    public boolean hayFrutaRepetida() {
        int tamaño = frutas.length;
        for (int i = 0; i < tamaño; i++) {
            for (int j = i + 1; j < tamaño; j++) {
                if (frutas[i].equals(frutas[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* Este cuenta cuntas frutas hay de como minimo X letras */
    /*
     * He eliminado la variable num ya que era prácticamente una copia de contador
     * y por lo tanto se puede usar contador en su lugar para realizar los cálculos.
     * Así ahorramos memoria
     * 
     * También he eliminado la línea que dividía a contador entre el tamaño del
     * array
     * de letras ya que la veo innecesaria para contar las frutas y daba lugar a la
     * posibilidad de un float
     * cuando el resultado debe ser int
     */
    int cuentaFrutasConMinimoLetras(int minimoLetras) {
        int contador = 0;
        for (String fruta : frutas) {
            if (fruta.length() >= minimoLetras) {
                contador++;
            }
        }
        return contador;
    }

    /* Calcula la media de caracteres de todas las frutas */
    // En el ejemplo la media de todos los caracteres es 7+5+6+5+7+4 / 6 = 30.66^
    /*
     * En este apartado no he cambiado nada porque considero que no tiene ningún
     * error
     */
    float mediaCaracteres() {
        float suma = 0;
        for (String frase : frutas) {
            suma += frase.length();
        }
        return suma / frutas.length;
    }
    /*
     * Por cada fruta, devuelve el numero de caracteres de cada fruta dividido por
     * la media de caracteres totales
     */
    // Contamos numero de caracteres de cada fruta = [7+5+6+5+7+4]
    // Numero total de frutas = 6
    // Media total de caracteres = 7+5+6+5+7+4 / 6 = 30.66^
    // Dividimos el numero de caracteres de cada fruta por la media total de
    // caracteres

    // [0.22, 1.16, 0.19, 0.16, 0.22, 0.13]
    /*
     * Para optimizar esta función he optado por crear 2 variables nuevas:
     * - La primera es tamañoFrutas y almacena el tamaño del array frutas para
     * que no se tenga que calcular a cada pasada del bucle, ahorrando así tiempo de
     * ejecución
     * 
     * -La segunda es media y almacena la media de los caracteres del array frutas
     * de esta manera, al ser un número fijo para este método debido a que no se
     * altera, el programa no tiene
     * que
     * calcular a cada pasada del bucle la media de los mismos datos anteriores,
     * ahorrando así tiempo de ejecución al acceder directamente a memoria
     */
    float[] numerosCaracteresDivididoEntreMediaTotal() {
        int tamañoFrutas = frutas.length;
        float media = mediaCaracteres();
        float[] resultado = new float[tamañoFrutas];
        for (int i = 0; i < tamañoFrutas; i++) {
            resultado[i] = frutas[i].length() / media;
        }
        return resultado;
    }
}
