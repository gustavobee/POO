package org.junit.jupiter;
import java.util.List;

public class Venda {
    private String cliente;
    private List<ItemVenda> itens;
    private double valorVenda;
    private double desconto;

    public Venda(String cliente, List<ItemVenda> itens, double valorVenda, double desconto) {
        this.cliente = cliente;
        this.itens = itens;
        this.valorVenda = valorVenda;
        this.desconto = desconto;
    }

    public String getCliente() {
        return cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public double getDesconto() {
        return desconto;
    }

    public double calculaTotalVenda() {
        double total = valorVenda;

        for (ItemVenda item : itens) {
            total += item.calculaTotal();
        }

        total -= desconto;

        return total;
    }
}
