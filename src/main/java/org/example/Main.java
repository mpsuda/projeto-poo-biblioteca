package org.example;

import org.example.*;

import java.util.Scanner;

class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Autor autor = new Autor("Marcos");

        try {
            Categoria c = new Categoria("Livro Terror", "D");
            System.out.println(c);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar categoria: " + e.getMessage());
        }

        Biblioteca biblioteca = new Biblioteca();

        Livro livroDigital = new LivroDigital("E-book Java", 2.5);
        Livro livroFisico = new LivroFisico("Java Básico", autor, 350);

        biblioteca.adicionarLivro(livroDigital);
        biblioteca.adicionarLivro(livroFisico);
        biblioteca.listarLivros();

        mostrarDetalhes(livroDigital);
        mostrarDetalhes(livroFisico);

        var livro2 = "Crepusculo";
        System.out.println("Título armazenado com var: " + livro2);

        System.out.println(Livro.getLivro());

        sc.close();
    }

    static void mostrarDetalhes(Livro livro) {
        switch (livro) {
            case LivroFisico fisico -> System.out.println("FÍSICO → " + fisico.exibirDetalhes());
            case LivroDigital digital -> System.out.println("DIGITAL → " + digital.exibirDetalhes());
            default -> System.out.println("Tipo de livro desconhecido");
        }
    }
}
