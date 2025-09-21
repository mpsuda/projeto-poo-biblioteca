package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }


    public void adicionarLivro(Livro livro) {
        if (livro != null) {
            livros.add(livro);
            System.out.println("📘 Livro adicionado: " + livro.getTitulo());
        } else {
            System.out.println("⚠ Não é possível adicionar um livro nulo.");
        }
    }


    public void removerLivro(Livro livro) {
        if (livro != null && livros.remove(livro)) {
            System.out.println("❌ Livro removido: " + livro.getTitulo());
        } else {
            System.out.println("⚠ Livro não encontrado.");
        }
    }


    public void listarLivros() {
        System.out.println("\n📚 Livros na Biblioteca:");
        if (livros.isEmpty()) {
            System.out.println("(nenhum livro cadastrado)");
        } else {
            for (Livro livro : livros) {
                System.out.println("- " + livro.exibirDetalhes());
            }
        }
    }

    public void emprestarLivro(Livro livro) {
        if (livro != null && livros.contains(livro)) {
            System.out.println("📖 Emprestando: " + livro.getTitulo());
        } else {
            System.out.println("⚠ Livro não encontrado na biblioteca.");
        }
    }


    public void devolverLivro(Livro livro) {
        if (livro != null && livros.contains(livro)) {
            System.out.println("🔙 Devolvendo: " + livro.getTitulo());
        } else {
            System.out.println("⚠ Livro não encontrado na biblioteca.");
        }
    }
}