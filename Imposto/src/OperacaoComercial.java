public class OperacaoComercial {
    private String nomeProduto;
    private double valorProduto;
    private double valorImposto;

    public OperacaoComercial(String nomeProduto, double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public double getValorImposto() {
        return valorImposto;
    }

    public void calcularImposto(TaxaImposto taxaImposto) {
        valorImposto = taxaImposto.calcularImposto(valorProduto);
    }

    public double getValorTotal() {
        return valorProduto+ valorImposto;
    }

    public String toString() {
        return "Produto: " + nomeProduto +
                "\nPreço Original: R$" + valorProduto +
                "\nImposto/Taxa: R$" + valorImposto +
                "\nValor Total: R$" + getValorTotal() + "\n";
    }
}
