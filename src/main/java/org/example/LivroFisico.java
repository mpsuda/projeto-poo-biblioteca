package org.example;

public final class LivroFisico extends Livro implements Emprestavel {
    private final int paginas;
    private boolean disponivel = true;

    public LivroFisico(String titulo, Autor autor, Categoria categoria, int paginas) {
        super(titulo, autor, categoria);
        this.paginas = paginas;
    }

    public int getPaginas() { return paginas; }
    public boolean isDisponivel() { return disponivel; }

    @Override
    public String exibirDetalhes() {
        return "[Físico] " + getTitulo() + " - " + getAutor().getNome() +
                " (" + paginas + " páginas, Disponível: " + disponivel + ")";
    }

    @Override
    public void emprestar() {
        if (!disponivel) {
            System.out.println("Livro já emprestado: " + getTitulo());
        } else {
            disponivel = false;
            System.out.println("Livro emprestado: " + getTitulo());
        }
    }

    @Override
    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido: " + getTitulo());
    }
}
