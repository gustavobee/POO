import org.junit.jupiter.ItemVenda;
import org.junit.jupiter.Venda;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class VendaTest {

    @Test
    public void testCalculaTotalVenda() {
        List<ItemVenda> itens = new ArrayList<>();
        itens.add(new ItemVenda("Produto A", 10.0, 2.0));
        itens.add(new ItemVenda("Produto B", 5.0, 3.0));

        Venda venda = new Venda("Cliente A", itens, 0.0, 0.0);
        assertEquals(35.0, venda.calculaTotalVenda());
    }

    @Test
    public void testDescontoNaoNegativo() {
        List<ItemVenda> itens = new ArrayList<>();
        itens.add(new ItemVenda("Produto C", 15.0, 1.0));

        Venda venda = new Venda("Cliente B", itens, 50.0, -5.0);
        assertTrue(venda.getDesconto() >= 0);
    }

    @Test
    public void testClienteNaoNulo() {
        List<ItemVenda> itens = new ArrayList<>();
        itens.add(new ItemVenda("Produto D", 20.0, 2.0));

        Venda venda = new Venda(null, itens, 0.0, 0.0);
        assertNotNull(venda.getCliente());
    }
}
