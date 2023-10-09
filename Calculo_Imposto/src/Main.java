public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(420.0);
        ContaCorrente contaCorrente = new ContaCorrente(4000.0);
        SegurodeVida seguroDeVida = new SegurodeVida();

        System.out.println("Saldo da Conta Poupança é: R$" + contaPoupanca.obterSaldo());
        System.out.println("Tributos da Conta Corrente é: R$" + contaCorrente.calculaTributos());
        System.out.println("Tributos do Seguro de Vida é: R$" + seguroDeVida.calculaTributos());

        contaCorrente.sacar(130.0);
        System.out.println("Saldo da Conta Corrente após o saque é de: R$" + contaCorrente.obterSaldo());
    }
}