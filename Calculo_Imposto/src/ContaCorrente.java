class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }
    @Override
    public double calculaTributos() {
        return getSaldo() * 0.01;
    }
}