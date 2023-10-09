public class Conta {
    public double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public double obterSaldo() {
        return saldo;
    }
}
