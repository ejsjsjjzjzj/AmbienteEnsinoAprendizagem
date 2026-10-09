package ambienteensinoaprendizagem;
 
import java.util.ArrayList;
 
public class Turma {
 
    private int id;
    private String nome;
    private Professor professor;
    private Disciplina disciplina;
    private ArrayList<Aluno> alunos;
 
    public Turma(int id, String nome,
    Professor professor, Disciplina disciplina) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }
 
    public int getId() {
        return id;
    }
 
    public String getNome() {
        return nome;
    }
 
    public Professor getProfessor() {
        return professor;
    }
 
    public Disciplina getDisciplina() {
        return disciplina;
    }
 
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno adicionado!");
    }
 
    public void exibirDados() {
        System.out.println("Turma: " + nome);
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Total de alunos: " + alunos.size());
    }
}