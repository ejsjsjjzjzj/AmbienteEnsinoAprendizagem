package ambienteensinoaprendizagem;
 
import java.util.ArrayList;
 
public class Sistema {
 
    ArrayList<Professor> professores = new ArrayList<>();
    ArrayList<Aluno> alunos = new ArrayList<>();
    ArrayList<Turma> turmas = new ArrayList<>();
    ArrayList<Matricula> matriculas = new ArrayList<>();
    ArrayList<Atividade> atividades = new ArrayList<>();
    ArrayList<Entrega> entregas = new ArrayList<>();
    ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
    ArrayList<Disciplina> disciplinas = new ArrayList<>();
 
 
    public void cadastrarProfessor(Professor professor) {
        professores.add(professor);
        System.out.println("Professor cadastrado!");
    }
 
    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno cadastrado!");
    }
 
    public void cadastrarTurma(Turma turma) {
        turmas.add(turma);
        System.out.println("Turma cadastrada!");
    }
 
    public void cadastrarMatricula(Matricula matricula) {
        matriculas.add(matricula);
        System.out.println("Matricula cadastrada!");
    }
 
    public void cadastrarAtividade(Atividade atividade) {
        atividades.add(atividade);
        System.out.println("Atividade cadastrada!");
    }
 
    public void publicarAtividade(Atividade atividade) {
        atividade.publicar();
    }
 
     
 public void registrarEntrega(Entrega entrega) {
    boolean matriculaAtiva = false;
 
    for (Matricula m : matriculas) {
        if (m.getAluno().getId() == entrega.getAluno().getId()
                && m.getTurma().getId() ==
                   entrega.getAtividade().getTurma().getId()
                && m.isAtiva()) {
 
            matriculaAtiva = true;
            break;
        }
    }
 
    if (matriculaAtiva) {
        entregas.add(entrega);
        System.out.println("Entrega registrada!");
    } else {
        System.out.println("Aluno sem matricula ativa nesta turma!");
    }
}
 
    
 
    public void registrarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
        avaliacao.avaliar();
    }
 
    public void listarProfessores() {
        for (Professor p : professores) {
            p.exibirDados();
        }
    }
 
    public void listarAlunos() {
        for (Aluno a : alunos) {
            a.exibirDados();
        }
    }
 
    public void listarTurmas() {
    if (turmas.isEmpty()) {
        System.out.println("Nenhuma turma cadastrada!");
    } else {
        for (Turma t : turmas) {
            t.exibirDados();
        }
    }
}
 
    public void listarAtividades() {
        for (Atividade a : atividades) {
            a.exibirDados();
        }
    }
 
    public void listarEntregas() {
        for (Entrega e : entregas) {
            e.exibirDados();
        }
    }
 
    public void listarAvaliacoes() {
    if (avaliacoes.isEmpty()) {
        System.out.println("Nenhuma avaliacao cadastrada!");
    } else {
        for (Avaliacao a : avaliacoes) {
            a.exibirDados();
        }
    }
}
    public Professor buscarProfessor(int id) {
    for (Professor p : professores) {
        if (p.getId() == id) {
            return p;
        }
    }
    return null;
}
    public Disciplina buscarDisciplina(int id) {
    for (Disciplina d : disciplinas) {
        if (d.getId() == id) {
            return d;
        }
    }
    return null;
}
    public void cadastrarDisciplina(Disciplina disciplina) {
    disciplinas.add(disciplina);
    System.out.println("Disciplina cadastrada!");
}
 
    public Turma buscarTurma(int id) {
    for (Turma t : turmas) {
        if (t.getId() == id) {
            return t;
        }
    }
    return null;
    }
    
    public Atividade buscarAtividade(int id) {
        for (Atividade a : atividades) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }
}

    