package Examen2aEvaluacionEntornos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OptimizaTest {
    @Test
    public void testBusca() {
        Optimiza opt = new Optimiza();
        opt.busca("fresa");
        assertEquals(true, opt.busca("fresa"));
        opt.busca("caramelo");
        assertEquals(false, opt.busca("caramelo"));

    }

    @Test
    public void testCuentaFrutasConMinimoLetras() {
        Optimiza opt = new Optimiza();
        int letras = 5;
        opt.cuentaFrutasConMinimoLetras(5);
        assertEquals(5, letras);

    }

    @Test
    public void testMediaCaracteres() {
        Optimiza opt = new Optimiza();
        assertEquals(5.66, opt.mediaCaracteres(), 0.01);

    }
}
