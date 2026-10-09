package ambienteensinoaprendizagem;
 
public class Matricula {
 
    private int id;
    private Aluno aluno;
    private Turma turma;
    private boolean ativa;
 
    public Matricula(int id, Aluno aluno, Turma turma) {
        this.id = id;
        this.aluno = aluno;
        this.turma = turma;
        this.ativa = true;
    }
 
    public int getId() {
        return id;
    }
 
    public Aluno getAluno() {
        return aluno;
    }
 
    public Turma getTurma() {
        return turma;
    }
 
    public boolean isAtiva() {
        return ativa;
    }
 
    public void cancelarMatricula() {
        ativa = false;
        System.out.println("Matricula cancelada!");
    }
 
    public void exibirDados() {
        System.out.println("Matricula: " + id);
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Turma: " + turma.getNome());
 
        if (ativa) {
            System.out.println("Status: ATIVA");
        } else {
            System.out.println("Status: INATIVA");
        }
    }
}