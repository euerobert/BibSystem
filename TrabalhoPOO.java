package trabalhopoo;

import java.util.Scanner;
import java.util.ArrayList;

public class TrabalhoPOO {

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        ArrayList<Livro> livros = null;
        String nomeLivro;
        Scanner reader = new Scanner(System.in);
        int op;
        
        System.out.println(" ------ Bem vindo ------");
        System.out.println(" ----------MENU---------");
                
        System.out.println("1.Cadastrar Pessoa\n" + 
                "2.Cadastrar Livro\n" + 
                "3.Realizar emprestimo\n" +
                "4.Devolução\n" + 
                "5 Emissão de Relatório\n" + 
                "6 Busca Pessoa\n" +
                "7.Busca Livro\n");
        
        Scanner opcao = new Scanner(System.in);
        op = opcao.nextInt();
        
        switch(op){
            case 1:
               cadastro.CadastrarPessoa();
               break;
            case 2:
               cadastro.CadastrarLivro();
               break;
            case 3: 
               
            case 4:
                
            case 5:
                
            case 6:
            
            case 7:
        }
    }
    
}
