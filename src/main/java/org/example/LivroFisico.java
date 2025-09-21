

package org.example;

public final class LivroFisico extends Livro implements Emprestavel {
    private boolean disponivel;

    public LivroFisico(String titulo, Autor autor, Categoria categoria, boolean disponivel) {
        super(titulo, autor, categoria);
        this.disponivel = disponivel;
    }

    public LivroFisico(String javaBásico, Autor autor, int i) {
        super();
    }

    public boolean inDisponivel() { return disponivel; }

    @Override
    public String exibirDetalhes() {
        return "[Físico] " + getTitulo() + " - " + getAutor().getNome() + " (Disponível: " + disponivel + ")";
    }

    @Override
    public void emprestar() {
        if (!disponivel) System.out.println("Livro disponível: " + getTitulo());
        else {
            disponivel = false;
            System.out.println(" Livro Emprestado: " + getTitulo());
        }
    }

    @Override
    public void devolver() {
        disponivel = true;
        System.out.println("Devolvido: " + getTitulo());
    }
}
