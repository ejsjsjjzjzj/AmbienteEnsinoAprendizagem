 
package ambienteensinoaprendizagem;
 
public class Entrega {
 
    private int id;
    private Aluno aluno;
    private Atividade atividade;
    private String conteudo;
    private String dataEntrega;
    private String status;
    private double nota;
    private String feedback;
 
    public Entrega(int id, Aluno aluno,
                   Atividade atividade, String conteudo) {
 
        this.id = id;
        this.aluno = aluno;
        this.atividade = atividade;
        this.conteudo = conteudo;
        this.dataEntrega = "";
        this.status = "PENDENTE";
        this.nota = 0;
        this.feedback = "";
    }
 
    public int getId() {
        return id;
    }
 
    public Aluno getAluno() {
        return aluno;
    }
 
    public Atividade getAtividade() {
        return atividade;
    }
 
    public String getStatus() {
        return status;
    }
 
    public double getNota() {
        return nota;
    }
 
    public String getFeedback() {
        return feedback;
    }
 
    public void realizarEntrega(String data) {
    if (atividade.podeEntregar()) {
        dataEntrega = data;
        status = "ENTREGUE";
        System.out.println("Entrega realizada!");
    } else {
        System.out.println("Nao foi possivel realizar a entrega!");
    }
    }
 
    public void avaliar(double nota, String feedback) {
 
    if (!status.equals("ENTREGUE")) {
        System.out.println("Entrega ainda nao realizada!");
        return;
    }
 
    if (nota >= 0 && nota <= atividade.getNotaMaxima()) {
        this.nota = nota;
        this.feedback = feedback;
        this.status = "AVALIADA";
 
        System.out.println("Entrega avaliada!");
    } else {
        System.out.println("Nota invalida!");
    }
}
 
        public boolean podeEntregar() {
            
      if (!status.equals("PENDENTE")) {
    System.out.println("Esta atividade ja foi entregue!");
    return false;
}      
 
    if (!atividade.isPublicada()) {
        System.out.println("Atividade ainda nao publicada!");
        return false;
    }
 
    atividade.verificarPrazo();
 
    if (!atividade.getEstado().equals("ABERTA")) {
        System.out.println("Prazo encerrado ou invalido!");
        return false;
    }
 
    return true;
}
 
        
 
    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Atividade: "
                           + atividade.getTitulo());
        System.out.println("Conteudo: " + conteudo);
        System.out.println("Data: " + dataEntrega);
        System.out.println("Status: " + status);
        System.out.println("Nota: " + nota);
        System.out.println("Feedback: " + feedback);
    }
}
 