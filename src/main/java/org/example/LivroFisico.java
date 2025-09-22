package org.example;

public final class LivroFisico extends Livro implements Emprestavel {
    private final double paginas;
    private boolean disponivel;

    public LivroFisico(String titulo, Autor autor, Categoria categoria, double paginas) {
        super(titulo, autor, categoria);
        this.paginas = paginas;
        this.disponivel = true;
    }

    public double getPaginas() {
        return paginas;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public String exibirDetalhes() {
        return "[Físico] " + getTitulo() + " - " + getAutor().getNome()
                + " (Disponível: " + disponivel + ")";
    }

    @Override
    public String emprestar() {
        if (disponivel) {
            return "Livro disponível: " + getTitulo();
        } else {
            disponivel = false;
            return "Livro emprestado: " + getTitulo();
        }
    }

    @Override
    public String devolver() {
        disponivel = true; // agora sim altera o atributo da classe
        return "Livro devolvido: " + getTitulo();
    }
}
