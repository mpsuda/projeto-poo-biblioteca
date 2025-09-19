package org.example;
import org.w3c.dom.ls.LSOutput;

public abstract class Livro {
    private String titulo;
    private Autor autor;
    private final Categoria categoria;


    public Livro(String titulo, Autor autor, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public static void Emprestar() { System.out.println("Emprestar"); }

    public static void Devolver() { System.out.println("Devolver"); }

    public abstract String exibirDetalhes();
}

