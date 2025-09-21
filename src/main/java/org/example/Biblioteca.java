package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro na biblioteca.");
            return;
        }
        for (var livro : livros) { // uso de var
            System.out.println(Livro.formatarLivro(livro));
        }
    }

    // 🔹 uso de return
    public Livro buscarPorTitulo(String titulo) {
        for (var livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public List<Livro> getLivros() { return livros; }
}
