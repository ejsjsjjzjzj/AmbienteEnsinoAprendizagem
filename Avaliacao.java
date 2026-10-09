package ambienteensinoaprendizagem;
 
public class Avaliacao {
 
    private int id;
    private Entrega entrega;
    private double nota;
    private String feedback;
 
    public Avaliacao(int id, Entrega entrega,
                     double nota, String feedback) {
 
        this.id = id;
        this.entrega = entrega;
        this.nota = nota;
        this.feedback = feedback;
    }
 
    public int getId() {
        return id;
    }
 
    public Entrega getEntrega() {
        return entrega;
    }
 
    public double getNota() {
        return nota;
    }
 
    public String getFeedback() {
        return feedback;
    }
 
    public void avaliar() {
        if (nota >= 0 &&
            nota <= entrega.getAtividade().getNotaMaxima()) {
 
            entrega.avaliar(nota, feedback);
            System.out.println("Avaliacao realizada!");
 
        } else {
            System.out.println("Nota invalida!");
        }
    }
 
    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Nota: " + nota);
        System.out.println("Feedback: " + feedback);
    }
}