package org.example;

public non-sealed class LivroDigital extends Livro {
    private final double tamanhoMB; // em MB

    public LivroDigital(String titulo, double tamanhoMB) {
        super(titulo, autor, categoria);
        this.tamanhoMB = tamanhoMB;
    }

    @Override
    public String exibirDetalhes() {
        return "Título: " + getTitulo() +
                ", Autor: " + getAutor().getNome() +
                ", Categoria: " + getCategoria().getNome() +
                ", Tamanho do Arquivo: " + tamanhoMB + " MB";
    }

    public double getTamanhoMB() {
        return tamanhoMB;
    }
}




