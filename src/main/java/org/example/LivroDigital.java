package org.example;

abstract class LivroDigital extends Livro {
    private String tamanhoArquivo;

    public LivroDigital(String titulo, Autor Autor, Categoria Categoria, String tamanhoArquivo) {
        super(titulo, Autor, Categoria);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    @Override
    public String exibirDetalhes() {
        return "Título: " + getTitulo() +
                ", Autor: " + getAutor().getNome() +
                ", Categoria: " + getCategoria().getNome() +
                ", Tamanho do Arquivo: " + tamanhoArquivo;
    }
}
