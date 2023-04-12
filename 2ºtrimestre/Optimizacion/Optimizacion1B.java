public class Optimizacion1B {
    void ejemplo1SinOptimizar() {
        int b = 0, c = 0, d = 0;
        int a = b + c;
        d = a - d;
        int e = (b + c) * d;
    }

    void ejemplo1Optimizado() {
        int b = 0, c = 0, d = 0;
        int a = b + c;
        d = a - d;
        int e = a * d;
    }

    void ejemplo2SinOptimizar(int valor, int item) {
        do {
            item = 10;
            valor += valor + item;
        } while (valor < 100);
    }

    void ejemplo2Optimizado(int valor, int item) {
        item = 10;
        do {
            valor += valor + item;
        } while (valor < 100);
    }

    void ejemplo3SinOptimizar(String total) {

        for (int i = 0; i < 10; i++) {
            // otras operaciones....
            String m = "Mensaje hola";
            int contador = i;
            total = m + contador;
        }
        System.out.println(total);
    }

    void ejemplo3Optimizado(String total) {

        String m = "Mensaje hola";

        for (int i = 0; i < 10; i++) {
            // otras operaciones....
            // int contador = i;
            // total = m + i;
        }
        total = m + (i - 1);
        System.out.println(total);
    }

    void ejemplo4SinOptimizar() {
        int i = 2 + 3;
        int j = 4;
        float f = j + 2.5f;
        /* aquí hay más código que usa i,j,f */
    }

    void ejemplo4Optimizado() {
        int i = 2 + 3;
        int j = 4;
        float f = j + 2.5f;
        /* aquí hay más código que usa i,j,f */
    }

    void ejemplo5SinOptimizar(int i, int c, int m) {
        int a = 3 + i;
        int f = a;
        int b = f + c;
        int d = a + m;
        m = f + d;
    }

    void ejemplo5Optimizado(int i, int c, int m) {
        int a = 3 + i;
        // int f = a;
        int b = a + c;
        int d = a + m;
        m = a + d;
    }

    void ejemplo7SinOptimizar() {
        int i = 1;
        float array[] = new float[5];
        array[i] = array[8 + i] + (i + 1) * 5 * 8 + (5 + 1);
        array[i - 1] = array[8 + i] + (i + 1) * 5 * 8 + (6 + 1);
    }

    void ejemplo7Optimizado() {
        int i = 1;
        float array[] = new float[5];
        float aux = array[8 + i];
        array[i] = aux + (i + 1) * 5 * 8 + (5 + 1);
        array[i - 1] = aux + (i + 1) * 5 * 8 + (6 + 1);
    }

    void ejemplo8SinOptimizar() {
        int pos = 3;
        int contador = 0;
        int array[] = new int[5];
        for (int i = 0; i < 2000; i++) {
            // cosas
            contador = array[pos] + i;
            // cosas
        }
        System.out.println(contador);
        // cosas
    }

    void ejemplo9SinOptimizar(int a) {
        float b = a / 2;
    }

    void ejemplo9Optimizado(int a) {

        float b = a * 0.5f;
    }

    int ejemplo10SinOptimizar() {
        int x = 10, y = 20;
        int z = x / y;
        return x / y;
    }

    int ejemplo10Optimizado() {
        int x = 10, y = 20;
       
        return x / y;
    }

    void ejemplo11SinOptimizar() {
        int i = 0;
        while (i < 10) {
            System.out.println("hola:" + i);
            i++;
        }
        int j = 0;
        while (j < 10) {
            System.out.println("adios:" + j);
            j++;
        }
    }

}

void ejemplo11Optimizado() {
    int i = 0;
    while (i < 10) {
        System.out.println("hola:" + i);
        i++;
    }
    i= 0;
    while (i< 10) {
        System.out.println("adios:" + j);
        i++;
    }
}

}

