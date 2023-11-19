package org.junit.jupiter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemVendaTest {

    @Test
    public void testCalculaTotal() {
        ItemVenda item = new ItemVenda("Produto A", 10.0, 2.0);
        assertEquals(20.0, item.calculaTotal());
    }

    @Test
    public void testDescricaoNaoNula() {
        ItemVenda item = new ItemVenda(null, 10.0, 2.0);
        assertNotNull(item.getDescricao());
    }

    @Test
    public void testValorUnitarioPositivo() {
        ItemVenda item = new ItemVenda("Produto B", -5.0, 2.0);
        assertTrue(item.getValorUnitario() > 0);
    }
}
