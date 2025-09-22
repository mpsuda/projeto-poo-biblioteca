package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in); // var para evitar repetir tipo
        var biblioteca = new Biblioteca();

        Autor autor = new Autor("Marcos Suda", "Brasileiro");
        Categoria categoria = new Categoria("Romance", "Literatura");

        Livro livro1 = new LivroFisico("Terror Java", autor, categoria, 350);
        Livro livro2 = new LivroDigital("Blood", autor, categoria, "2.5MB");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

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
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    for (var livro : biblioteca.getLivros()) {
                        System.out.println(livro.exibirDetalhes());
                    }
                }
                case 2 -> {
                    System.out.print("Digite o título: ");
                    var titulo = sc.nextLine();
                    Livro encontrado = biblioteca.buscarPorTitulo(titulo);
                    System.out.println(encontrado != null ? encontrado.exibirDetalhes() : "Livro não encontrado.");
                }
                case 3 -> {
                    System.out.print("Digite o título: ");
                    var titulo = sc.nextLine();
                    var livro = biblioteca.buscarPorTitulo(titulo);
                    if (livro instanceof LivroFisico lf) { // pattern matching
                        lf.emprestar();
                    } else {
                        System.out.println("Esse livro não pode ser emprestado.");
                    }
                }
                case 4 -> {
                    System.out.print("Digite o título: ");
                    var titulo = sc.nextLine();
                    var livro = biblioteca.buscarPorTitulo(titulo);
                    if (livro instanceof LivroFisico lf) {
                        lf.devolver();
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