package br.com.sistemalivraria;

import br.com.sistemalivraria.service.Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca lib = new Biblioteca();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================== BOAS VINDAS A LIVRARIA ===================\n");
        do {
            System.out.println("Gostaria de ver a lista de livros disponíveis para empréstimo?");
            String resposta = scanner.next().toLowerCase();
            System.out.println();

            if (resposta.equals("não")) {
                System.out.println("Obrigado por acessar!\nEncerrando...\n");
                break;
            } else if (resposta.equals("sim")) {
                String livrosDisponiveis = lib.listarLivrosDisponiveis();
                if (livrosDisponiveis.isEmpty()) {
                    System.out.println("Infelizmente não existem mais livros disponíveis. Encerrando...");
                    break;
                } else {
                    System.out.println("Lista de livros disponíveis na biblioteca:");
                    System.out.println(livrosDisponiveis);
                    System.out.println("Digite o número do livro que você deseja pegar emprestado:");
                    int livroEscolhido = scanner.nextInt();
                    System.out.println("Por favor, digite seu nome para registro: ");
                    String nomeCliente = scanner.next();
                    if (lib.escolherLivro(livroEscolhido, nomeCliente)) {
                        break;
                    }
                }
            } else {
                System.out.println("Por favor, responda com Sim ou Não");
            }

        } while (true);

        scanner.close();
    }
}
