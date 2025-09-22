package org.example;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var biblioteca = new Biblioteca();

        Autor autor = new Autor("Marcos");
        Categoria categoria = new Categoria("Programação", "Técnico");

        LivroFisico livroFisico = new LivroFisico("Terror Java", autor, categoria, 350);
        LivroDigital livroDigital = new LivroDigital("Aprendendo Java", autor, categoria, "2.5MB");

        biblioteca.adicionarLivro(livroFisico);
        biblioteca.adicionarLivro(livroDigital);

        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Listar livros");
            System.out.println("2 - Buscar livro por título");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> biblioteca.listarLivros();
                case 2 -> {
                    System.out.print("Digite o título: ");
                    var titulo = sc.nextLine().trim();
                    var livro = biblioteca.buscarPorTitulo(titulo);
                    System.out.println(livro != null ? livro.exibirDetalhes() : "Livro não encontrado.");
                }
                case 3 -> {
                    System.out.print("Digite o título: ");
                    var titulo = sc.nextLine().trim();
                    var livro = biblioteca.buscarPorTitulo(titulo);
                    if (livro instanceof LivroFisico fisico) {
                        System.out.println(fisico.emprestar());
                    } else {
                        System.out.println("Esse livro não pode ser emprestado.");
                    }
                }
                case 4 -> {
                    System.out.print("Digite o título: ");
                    var titulo = sc.nextLine().trim();
                    var livro = biblioteca.buscarPorTitulo(titulo);
                    if (livro instanceof LivroFisico fisico) {
                        System.out.println(fisico.devolver());
                    } else {
                        System.out.println("Esse livro não pode ser devolvido.");
                    }
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
