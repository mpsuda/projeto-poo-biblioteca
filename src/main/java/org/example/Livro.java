package org.example;

public sealed abstract class Livro permits LivroFisico, LivroDigital {
    private final String titulo;
    private final Autor autor;
    private final Categoria categoria;

    public Livro(String titulo, Autor autor, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getTitulo() { return titulo; }
    public Autor getAutor() { return autor; }
    public Categoria getCategoria() { return categoria; }

    public abstract String exibirDetalhes();

    // 🔹 switch + pattern matching para formatar saída
    public static String formatarLivro(Livro livro) {
        return switch (livro) {
            case LivroFisico lf -> "📕 " + lf.getTitulo() + " (" + lf.getPaginas() + " páginas)";
            case LivroDigital ld -> "💾 " + ld.getTitulo() + " (" + ld.getTamanhoArquivo() + ")";
        };
    }
}