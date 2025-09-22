package org.example;

public non-sealed class LivroDigital extends Livro {
    private final String tamanhoArquivo;

    public LivroDigital(String titulo, Autor autor, Categoria categoria, String tamanhoArquivo) {
        super(titulo, autor, categoria);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getTamanhoArquivo() { return tamanhoArquivo; }

    @Override
    public String exibirDetalhes() {
        return "[Digital] " + getTitulo() + " - " + getAutor().getNome()
                + " (" + tamanhoArquivo + ")";
    }
}
