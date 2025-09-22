package org.example;

public sealed abstract class Livro permits LivroFisico, LivroDigital {
    private final String titulo;
    private final Autor autor;
    private final Categoria categoria;

    public Livro(String titulo, Autor autor, Categoria categoria) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Título obrigatório.");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getTitulo() { return titulo; }
    public Autor getAutor() { return autor; }
    public Categoria getCategoria() { return categoria; }


    public abstract String exibirDetalhes();

/*
    public static void emprestar() {
        System.out.println("Livro emprestado!");
    }

    public static void devolver() {
        System.out.println("Livro devolvido!");
    }

 */
}