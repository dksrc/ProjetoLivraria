package br.com.sistemalivraria.model;

import java.time.LocalDate;

public class Autor {
    private static int contId = 1;

    private Integer id;
    private String nome;
    private LocalDate dataNascimento;

    public Autor(String nome, LocalDate dataNascimento) {
        this.id = contId;
        contId++;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }
}
