package br.com.sistemalivraria.service;

import br.com.sistemalivraria.model.Autor;
import br.com.sistemalivraria.model.Emprestimo;
import br.com.sistemalivraria.model.Livro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca() {
        Autor machadoDeAssis = new Autor("Machado de Assis", LocalDate.of(1839, 6, 21));
        Autor gabrielGarciaMarquez = new Autor("Gabriel García Márquez", LocalDate.of(1927, 3, 6));
        Autor antoineSaintExupery = new Autor("Antoine de Saint-Exupéry", LocalDate.of(1900, 6, 29));
        Autor aldousHuxley = new Autor("Aldous Huxley", LocalDate.of(1894, 7, 26));
        Autor franzKafka = new Autor("Franz Kafka", LocalDate.of(1883, 7, 3));
        Autor carolinaMariaDeJesus = new Autor("Carolina Maria de Jesus", LocalDate.of(1914, 3, 14));
        Autor janeAusten = new Autor("Jane Austen", LocalDate.of(1775, 12, 16));
        Autor patrickRothfuss = new Autor("Patrick Rothfuss", LocalDate.of(1973, 6, 6));
        Autor fiodorDostoievski = new Autor("Fiódor Dostoiévski", LocalDate.of(1821, 11, 11));
        Autor pauloCoelho = new Autor("Paulo Coelho", LocalDate.of(1947, 8, 24));

        Livro domCasmurro = new Livro("Dom Casmurro", machadoDeAssis);
        Livro cemAnosDeSolidao = new Livro("Cem Anos de Solidão", gabrielGarciaMarquez);
        Livro pequenoPrincipe = new Livro("O Pequeno Príncipe", antoineSaintExupery);
        Livro admiravelMundoNovo = new Livro("Admirável Mundo Novo", aldousHuxley);
        Livro metamorfose = new Livro("A Metamorfose", franzKafka);
        Livro quartoDeDespejo = new Livro("Quarto de Despejo: Diário de uma Favelada", carolinaMariaDeJesus);
        Livro orgulhoEPreconceito = new Livro("Orgulho e Preconceito", janeAusten);
        Livro oNomeDoVento = new Livro("O Nome do Vento", patrickRothfuss);
        Livro crimeECastigo = new Livro("Crime e Castigo", fiodorDostoievski);
        Livro oAlquimista = new Livro("O Alquimista", pauloCoelho);

        autores.add(machadoDeAssis);
        autores.add(gabrielGarciaMarquez);
        autores.add(antoineSaintExupery);
        autores.add(aldousHuxley);
        autores.add(franzKafka);
        autores.add(carolinaMariaDeJesus);
        autores.add(janeAusten);
        autores.add(patrickRothfuss);
        autores.add(fiodorDostoievski);
        autores.add(pauloCoelho);

        livros.add(domCasmurro);
        livros.add(cemAnosDeSolidao);
        livros.add(pequenoPrincipe);
        livros.add(admiravelMundoNovo);
        livros.add(metamorfose);
        livros.add(quartoDeDespejo);
        livros.add(orgulhoEPreconceito);
        livros.add(oNomeDoVento);
        livros.add(crimeECastigo);
        livros.add(oAlquimista);
    }

    public String listarLivrosDisponiveis() {
        StringBuilder livrosDisponiveis = new StringBuilder();
        String linha = "";

        for (Livro livro : livros) {
            if (livro.getDisponivel()) {
                linha = livro.getId() + " - " + livro.getTitulo() + " - " + livro.getAutor().getNome();

                livrosDisponiveis.append(linha).append("\n");
            }
        }

        if (linha.isEmpty()) {
            livrosDisponiveis.append(linha);
        }

        return livrosDisponiveis.toString();
    }

    public Boolean escolherLivro(int numeroLivro, String nomeCliente) {
        if (numeroLivro < 1 || numeroLivro > livros.size()) {
            System.out.println("\nO número digitado não pertence a nenhum livro.\n");
            return false;
        } else {
            Livro livroEscolhido = livros.get(numeroLivro - 1);
            livroEscolhido.setDisponivel(false);

            Emprestimo emprestimo = new Emprestimo(livroEscolhido, nomeCliente);
            emprestimos.add(emprestimo);

            System.out.println("\nEmpréstimo concluído.\n" + "Livro: " + emprestimo.getLivro().getTitulo() + " do(a) " +
                    "autor(a) " + emprestimo.getLivro().getAutor().getNome() + "\nCliente: " + emprestimo.getNomeCliente()
                    + "\nObrigado, até logo!");
            return true;
        }
    }
}
