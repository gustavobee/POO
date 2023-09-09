import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OperacaoComercial> operacoes = new ArrayList<>();

        // Exemplo de operações comerciais
        operacoes.add(new OperacaoComercial("Camisa", 100.0));
        operacoes.add(new OperacaoComercial("Tênis", 200.0));
        operacoes.add(new OperacaoComercial("Calça", 150.0));

        // Calcula os impostos/taxas para cada operação
        for (OperacaoComercial operacao : operacoes) {
            if (operacao.getNomeProduto().toLowerCase().contains("produto")) {
                operacao.calcularImposto(new ICMS());
                operacao.calcularImposto(new IPI());
            } else if (operacao.getNomeProduto().toLowerCase().contains("serviço")) {
                operacao.calcularImposto(new ISS());
            }
        }

        // Exibe os resultados
        for (OperacaoComercial operacao : operacoes) {
            System.out.println(operacao.toString());
        }
    }
}