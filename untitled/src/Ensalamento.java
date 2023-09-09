public class Ensalamento {
    public static void realizarEnsalamento() {
        Curso cursoTI = new Curso("TI");
        Curso cursoADM = new Curso("ADM");

        Disciplina pooTI = new Disciplina("POO do curso de TI", "TI");
        Disciplina estruturaDadosTI = new Disciplina("Estrutura de Dados do curso de TI", "TI");
        Disciplina biADM = new Disciplina("BI do curso de ADM", "ADM");

        cursoTI.adicionarDisciplina(pooTI);
        cursoTI.adicionarDisciplina(estruturaDadosTI);
        cursoADM.adicionarDisciplina(biADM);

        Professor mia = new Professor("Mia", "POO");
        Professor saulo = new Professor("Saulo", "Estrutura de Dados");
        Professor paula = new Professor("Paula", "BI");

        Aluno alfredo = new Aluno("Alfredo", "TI");
        Aluno peterson = new Aluno("Peterson", "ADM");
        Aluno wendel = new Aluno("Wendel", "TI");
        Aluno ian = new Aluno("Ian", "ADM");
        Aluno debra = new Aluno("Debra", "TI");
        Aluno luana = new Aluno("Luana", "ADM");
        Aluno bruno = new Aluno("Bruno", "TI");
        Aluno romeu = new Aluno("Romeu", "ADM");
        Aluno julieta = new Aluno("Julieta", "TI");
        Aluno maria = new Aluno("Maria", "ADM");
        Aluno capitú = new Aluno("Capitú", "TI");
        Aluno bentinho = new Aluno("Bentinho", "ADM");
        Aluno amelia = new Aluno("Amélia", "TI");

        Turma turmaPOOTI = new Turma(mia, pooTI);
        turmaPOOTI.adicionarAluno(alfredo);
        turmaPOOTI.adicionarAluno(wendel);
        turmaPOOTI.adicionarAluno(debra);
        turmaPOOTI.adicionarAluno(bruno);
        turmaPOOTI.adicionarAluno(julieta);
        turmaPOOTI.adicionarAluno(capitu);
        turmaPOOTI.adicionarAluno(amelia);

        Turma turmaEstruturaDadosTI = new Turma(saulo, estruturaDadosTI);
        turmaEstruturaDadosTI.adicionarAluno(alfredo);
        turmaEstruturaDadosTI.adicionarAluno(wendel);
        turmaEstruturaDadosTI.adicionarAluno(debra);
        turmaEstruturaDadosTI.adicionarAluno(bruno);
        turmaEstruturaDadosTI.adicionarAluno(julieta);
        turmaEstruturaDadosTI.adicionarAluno(capitu);
        turmaEstruturaDadosTI.adicionarAluno(amelia);

        Turma turmaBIADM = new Turma(paula, biADM);
        turmaBIADM.adicionarAluno(peterson);
        turmaBIADM.adicionarAluno(ian);
        turmaBIADM.adicionarAluno(luana);
        turmaBIADM.adicionarAluno(romeu);
        turmaBIADM.adicionarAluno(maria);
        turmaBIADM.adicionarAluno(bentinho);

        System.out.println(turmaPOOTI.getInfoTurma());
        System.out.println(turmaEstruturaDadosTI.getInfoTurma());
        System.out.println(turmaBIADM.getInfoTurma());
    }
}
