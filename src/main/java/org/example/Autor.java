package org.example;

public class Autor {
    private String nomeAutor;
    private String nacionalidade;

    public Autor(String nomeAutor, String nacionalidade) {
        this.nomeAutor = nomeAutor;
        this.nacionalidade = nacionalidade;
    }
    public Autor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
        System.out.println(this.nomeAutor);
    }
    public Autor() {
        System.out.print("Autor sem nada");
    }
    public String getNome() {
        return nomeAutor;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
}
