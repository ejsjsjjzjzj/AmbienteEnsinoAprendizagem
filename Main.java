package ambienteensinoaprendizagem;
 
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);
        Sistema sistema = new Sistema();
        
        sistema.cadastrarDisciplina(new Disciplina(1, "Programacao"));
 
 
        int opcao;
 
        do {
            System.out.println("\n=== SISTEMA DE ENSINO ===");
            System.out.println("1 - Cadastrar professor");
            System.out.println("2 - Cadastrar aluno");
            System.out.println("3 - Listar professores");
            System.out.println("4 - Listar alunos");
            System.out.println("5 - Listar turmas");
            System.out.println("6 - Listar atividades");
            System.out.println("7 - Listar entregas");
            System.out.println("8 - Listar avaliacoes");
            System.out.println("9 - Cadastrar turma");
            System.out.println("10 - Publicar atividade");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
 
            opcao = entrada.nextInt();
            entrada.nextLine();
 
            switch (opcao) {
 
                case 1:
                    System.out.print("ID: ");
                    int idProfessor = entrada.nextInt();
                    entrada.nextLine();
 
                    System.out.print("Nome: ");
                    String nomeProfessor = entrada.nextLine();
 
                    System.out.print("Email: ");
                    String emailProfessor = entrada.nextLine();
 
                    Professor professor = new Professor(
                        idProfessor, nomeProfessor, emailProfessor);
 
                    sistema.cadastrarProfessor(professor);
                    break;
 
                case 2:
                    System.out.print("ID: ");
                    int idAluno = entrada.nextInt();
                    entrada.nextLine();
 
                    System.out.print("Nome: ");
                    String nomeAluno = entrada.nextLine();
 
                    System.out.print("Email: ");
                    String emailAluno = entrada.nextLine();
 
                    Aluno aluno = new Aluno(
                        idAluno, nomeAluno, emailAluno);
 
                    sistema.cadastrarAluno(aluno);
                    break;
 
                case 3:
                    sistema.listarProfessores();
                    break;
 
                case 4:
                    sistema.listarAlunos();
                    break;
 
                case 5:
                    sistema.listarTurmas();
                    break;
 
                case 6:
                    sistema.listarAtividades();
                    break;
 
                case 7:
                    sistema.listarEntregas();
                    break;
 
                case 8:
                    sistema.listarAvaliacoes();
                    break;
                    
                    case 9:
                        System.out.println("Cadastro de turma");
 
                    System.out.print("ID da turma: ");
                    int idTurma = entrada.nextInt();
                    entrada.nextLine();
                    
                    System.out.print("Nome da turma: ");
                    String nomeTurma = entrada.nextLine();
                    
                    System.out.print("ID do professor: ");
                     int idProfessorTurma = entrada.nextInt();
 
                     entrada.nextLine();
                     
                   Professor professorTurma = sistema.buscarProfessor(idProfessorTurma);
 
                     
                     System.out.print("ID da disciplina: ");
                     int idDisciplina = entrada.nextInt();
                     entrada.nextLine();
                     
                     Disciplina disciplinaTurma = sistema.buscarDisciplina(idDisciplina);
 
                     if (professorTurma != null && disciplinaTurma != null) {
    Turma novaTurma = new Turma(idTurma, nomeTurma, professorTurma, disciplinaTurma);
    sistema.cadastrarTurma(novaTurma);
    System.out.println("Turma cadastrada com sucesso!");
} else {
    System.out.println("Professor ou disciplina nao encontrado!");
}
 
 
                    break;
    
                    case 10:
                 System.out.println("Publicar atividade");
                 
                 System.out.print("ID da atividade: ");
                 int idAtividade = entrada.nextInt();
                 entrada.nextLine();
                 
                 System.out.print("Titulo da atividade: ");
                 String tituloAtividade = entrada.nextLine();
                 
                 System.out.print("Descricao da atividade: ");
                 String descricaoAtividade = entrada.nextLine();
                 
                 System.out.print("Prazo de entrega (AAAA-MM-DD): ");
                 String prazoAtividade = entrada.nextLine();
                 
                 System.out.print("Nota maxima da atividade: ");
                 double notaMaxima = entrada.nextDouble();
                 entrada.nextLine();
                 
                 System.out.print("ID da turma: ");
                 int idTurmaAtividade = entrada.nextInt();
                 entrada.nextLine();
                 
                 Turma turmaAtividade = sistema.buscarTurma(idTurmaAtividade);
                 
                 if (turmaAtividade != null) {
                     
                     Atividade novaAtividade = new Atividade(
                 idAtividade,
                 tituloAtividade,
                 descricaoAtividade,
                 turmaAtividade,
                 prazoAtividade,
                 notaMaxima             
                 );
                     
                 sistema.cadastrarAtividade(novaAtividade);    
 
                 }
                 else {
                 System.out.println("Turma nao encontrada!");
                 }
                 
                  break;
 
                case 0:
                    System.out.println("Sistema encerrado!");
                    break;
                    
               
 
                default:
                    System.out.println("Opcao invalida!");
            }
 
        } while (opcao != 0);
 
        entrada.close();
    }
}