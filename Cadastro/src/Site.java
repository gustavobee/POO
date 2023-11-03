import java.io.*;

class Site implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int nextId = 1;

    private int id;
    private String descricao;
    private String url;
    private String dataCadastro;

    public Site(int id, String descricao, String url, String dataCadastro) {
        this.id = id;
        this.descricao = descricao;
        this.url = url;
        this.dataCadastro = dataCadastro;
    }

    public static int loadNextId() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("last_id.dat"))) {
            return (int) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return 1;
        }
    }

    public static void saveNextId(int nextId) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("last_id.dat"))) {
            outputStream.writeObject(nextId);
        } catch (IOException e) {
            System.out.println("Erro ao salvar o próximo ID: " + e.getMessage());
        }
    }
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUrl() {
        return url;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public static int getNextId() {
        int nextId = loadNextId();
        saveNextId(nextId + 1);
        return nextId;
    }
}
