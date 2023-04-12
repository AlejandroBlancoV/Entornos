
package ejercicioPractico;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DocumentoIdentificativoTest {
    @Test
    public void testGetLetter() {
        DocumentoIdentificativo doc = new DocumentoIdentificativo();
        doc.type = "NIF";
        doc.text = "36765546N";
        assertEquals("N", doc.getLetter());

    }

    @Test
    public void testIsValid() {
        DocumentoIdentificativo doc = new DocumentoIdentificativo();
        doc.type = "CIF";
        doc.text = "B43738723";
        assertEquals(true, doc.isValid());
    }
}
