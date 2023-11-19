package org.junit.jupiter;

public class ItemVenda {
    private String descricao;
    private double valorUnitario;
    private double quantidade;

    public ItemVenda(String descricao, double valorUnitario, double quantidade) {
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double calculaTotal() {
        return valorUnitario * quantidade;
    }
}
