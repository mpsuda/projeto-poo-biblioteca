package org.example;

abstract class LivroFisico extends Livro{
    private boolean disponivel;

    public LivroFisico(String titulo, Autor Autor, Categoria Categoria,boolean disponivel) {
        super(titulo, Autor, Categoria);
        this.disponivel = disponivel;
    }
    public boolean getDisponivel() {
        return disponivel;
    }

    @Override
    public String exibirDetalhes() {
        return "Título: " + getTitulo() +
                ", Autor: " + getAutor().getNome() +
                ", Categoria: " + getCategoria().getNome() +
                ", Disponível: " + disponivel ;
    }
}