public class Turma {
    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos;

    public Turma(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public String getInfoTurma() {
        StringBuilder info = new StringBuilder();
        info.append("Turma de ").append(disciplina.getNome()).append(" - ").append(professor.getNome()).append("\n");
        info.append("Alunos:\n");
        for (Aluno aluno : alunos) {
            info.append("- ").append(aluno.getNome()).append(" (").append(aluno.getCurso()).append(")\n");
        }
        return info.toString();
    }
}
