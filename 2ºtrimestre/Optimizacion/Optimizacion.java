public class Optimizacion {

    void ejercioSinOptimizar() {
        int i = 1;
        String temp = "";
        StringBuilder sb = new StringBuilder();
        while (i < 100000) {
            // System.out.println(i);
            sb.append(i);
            sb.append("\n");
            i++;
        }
        System.out.println(sb);
        
    }

    public static void main(String[] args) {
        Optimizacion op = new Optimizacion();
        op.ejercioSinOptimizar();
    }
}
