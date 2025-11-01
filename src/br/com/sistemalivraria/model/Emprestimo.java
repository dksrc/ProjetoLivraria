package br.com.sistemalivraria.model;

import java.time.LocalDateTime;

public class Emprestimo {
    private static int contId = 1;

    private Integer id;
    private Livro livro;
    private String nomeCliente;
    private final LocalDateTime dataEmprestimo = LocalDateTime.now();
    private LocalDateTime dataDevolucao;

    public Emprestimo(Livro livro, String nomeCliente) {
        this.id = contId;
        contId++;
        this.livro = livro;
        this.nomeCliente = nomeCliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
}
