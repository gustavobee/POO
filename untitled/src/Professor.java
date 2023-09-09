public class Professor extends Pessoa {
    private String curso;
    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }
}
