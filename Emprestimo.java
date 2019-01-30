package trabalhopoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Emprestimo {
    
    private String nomePessoa, nomeLivro;
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    Scanner reader = new Scanner(System.in);
    ArrayList<Livro> livros;

    public Scanner getReader() {
        return reader;
    }

    public void setReader(Scanner reader) {
        this.reader = reader;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public Emprestimo(String nomePessoa, String nomeLivro) {
        this.nomePessoa = nomePessoa;
        this.nomeLivro = nomeLivro;
    }
    
    Emprestimo realizaEmprestimo(Cadastro cadastros, Pessoa pessoas){
     
        return e ai robert;
    }
    
    void verificaLivro(){
        System.out.println("Nome livro: ");
        nomeLivro = reader.next();
        
        for(Livro a: livros){
            if(nomeLivro.equals(a.getNomeLivro())){
                System.out.println("Livro Disponivel");
            }
        }
  }
    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getnomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String NomeLivro) {
        this.nomeLivro = NomeLivro;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
    
    
    
}
