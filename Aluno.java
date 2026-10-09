 
package ambienteensinoaprendizagem;
 
public class Aluno {
 
    private int id;
    private String nome;
    private String email;
 
    public Aluno(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
 
    public int getId() {
        return id;
    }
 
    public String getNome() {
        return nome;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void exibirDados() {
        System.out.println("Aluno: " + nome);
        System.out.println("Email: " + email);
    }
}
 