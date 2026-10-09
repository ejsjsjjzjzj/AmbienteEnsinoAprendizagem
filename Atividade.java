package ambienteensinoaprendizagem;

import java.time.LocalDate;
 
public class Atividade {
 
    private int id;
    private String titulo;
    private String descricao;
    private Turma turma;
    private String nomeTurma;
    private String prazo;
    private double notaMaxima;
    private boolean publicada;
    private String estado = "ABERTA";
 
    public Atividade(int id, String titulo,
                     String descricao, Turma turma,
                     String prazo, double notaMaxima) {
 
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.turma = turma;
        this.nomeTurma = "";
        this.prazo = prazo;
        this.notaMaxima = notaMaxima;
        this.publicada = false;
    }
 
    public int getId() {
        return id;
    }
 
    public String getTitulo() {
        return titulo;
    }
 
    public Turma getTurma() {
        return turma;
    }
 
    public double getNotaMaxima() {
        return notaMaxima;
    }
 
    public boolean isPublicada() {
        return publicada;
    }
 
    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }
 
    public String getNomeTurma() {
        return nomeTurma;
    }
 
    public void publicar() {
        publicada = true;
        System.out.println("Atividade publicada!");
    }
 
    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Descricao: " + descricao);
        System.out.println("Turma: " + nomeTurma);
        System.out.println("Prazo: " + prazo);
        System.out.println("Nota maxima: " + notaMaxima);
        System.out.println("Publicada: " + publicada);
    }
    
    public String getEstado() {
    verificarPrazo();
    return estado;
}
 
public void verificarPrazo() {
    try {
        LocalDate dataPrazo = LocalDate.parse(prazo);
 
        if (LocalDate.now().isAfter(dataPrazo)) {
            estado = "ENCERRADA";
        } else {
            estado = "ABERTA";
        }
    } catch (Exception e) {
        System.out.println("Prazo invalido! Use AAAA-MM-DD.");
    }
}
 
public boolean podeEntregar() {
    if (!publicada) {
        System.out.println("Atividade ainda não publicada!");
        return false;
    }
 
    verificarPrazo();
 
    if (!estado.equals("ABERTA")) {
        System.out.println("Prazo encerrado ou inválido!");
        return false;
    }
 
    return true;
}
}