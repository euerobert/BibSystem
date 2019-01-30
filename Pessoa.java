package trabalhopoo;
public class Pessoa {
    private String nome, telefone, matricula, email;

    public Pessoa(){
        
    }
    public Pessoa(String nome, String telefone, String matricula, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.matricula = matricula;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
