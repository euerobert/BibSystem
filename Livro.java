package trabalhopoo;


public class Livro {
    private String nomeLivro, anoLancamento, autor, tema;
    private int qnt;

    public Livro(String nomeLivro, String anoLancamento, String autor, String tema, int qnt) {
        this.nomeLivro = nomeLivro;
        this.anoLancamento = anoLancamento;
        this.autor = autor;
        this.tema = tema;
        this.qnt = qnt;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    
    
}
