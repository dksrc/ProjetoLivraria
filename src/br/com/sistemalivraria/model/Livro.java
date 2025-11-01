package br.com.sistemalivraria.model;

import java.time.LocalDate;

public class Livro {
    private static int contId = 1;

    private Integer id;
    private String titulo;
    private Autor autor;
    private Boolean disponivel = true;
    private final LocalDate dataCadastro = LocalDate.now();
    private LocalDate dataAtualizacao;

    public Livro(String titulo, Autor autor) {
        this.id = contId;
        contId++;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Autor getAutor() {
        return autor;
    }
}
