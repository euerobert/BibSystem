package trabalhopoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    ArrayList<Livro> livros = new ArrayList<>();

    Scanner reader = new Scanner(System.in);
    
    void CadastrarPessoa(){
        System.out.println("-----Cadastramento de Pessoas------");
        
        this.pessoas.add(CadastroPessoa());
    }
    
    Pessoa CadastroPessoa(){
        System.out.print("Nome: ");
        String nome = reader.nextLine();
        
        System.out.println("Telefone: ");
        String telefone = reader.nextLine();
        
        System.out.print("Matricula: ");
        String matricula = reader.nextLine();
        
        System.out.println("Email: ");
        String email = reader.nextLine();
        
        return new Pessoa(nome, telefone, matricula, email);
    }
    
    void CadastrarLivro(){
        
        System.out.println("-----Cadastro de Livros----");
        this.livros.add(CadastroLivro());
        
    }
    Livro CadastroLivro(){
        System.out.println("Nome livro: ");
        String nome = reader.nextLine();
        System.out.println("Ano de Lançamento: ");
        String ano = reader.next();
        System.out.println("Autor: ");
        String autor = reader.next();
        System.out.println("Assunto: ");
        String assunto = reader.next();
        System.out.println("Quantidade do mesmo livro: ");
        int qnt = reader.nextInt();
        
        return new Livro(nome, ano, autor, assunto, qnt);
    }
    
    void salvaArquivo(){
        
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
    
    
}
