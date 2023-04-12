import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VentaTest {
    @Test
    public void testCalculaCosteTotal() {
        Venta v = new Venta();
        v.cliente = new clienteNormal();
        v.cliente.tieneCuponGratis = false;
        v.coste = 4000;
        v.descuento = 5;
        float total = v.calculaCosteTotal();
        assertEquals(0, total, 0);
    }
}
