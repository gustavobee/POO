import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String PASTA_DADOS = "dados/";

    public static void main(String[] args) {
        List<Site> sites = new ArrayList<>();

        File pastaDados = new File(PASTA_DADOS);
        if (!pastaDados.exists()) {
            pastaDados.mkdirs();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream(PASTA_DADOS + "sites.dat"))) {
            sites = (List<Site>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("Descrição do site (ou 'sair' para sair): ");
                String descricao = reader.readLine();
                if (descricao.equalsIgnoreCase("sair")) {
                    break;
                }

                System.out.print("URL do site: ");
                String url = reader.readLine();

                System.out.print("Data de cadastro (no formato dd/mm/aaaa): ");
                String dataCadastro = reader.readLine();

                Site site = new Site(Site.getNextId(), descricao, url, dataCadastro);
                sites.add(site);

                try (ObjectOutputStream outputStream = new ObjectOutputStream(
                        new FileOutputStream(PASTA_DADOS + site.getId() + ".data"))) {
                    outputStream.writeObject(site);
                } catch (IOException e) {
                    System.out.println("Erro ao salvar arquivo: " + e.getMessage());
                }
            }

            try (ObjectOutputStream outputStream = new ObjectOutputStream(
                    new FileOutputStream(PASTA_DADOS + "sites.dat"))) {
                outputStream.writeObject(sites);
            } catch (IOException e) {
                System.out.println("Erro ao salvar dados: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Erro de entrada/saída: " + e.getMessage());
        }
    }
}