package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.controller.DadosAlteracaoFilme;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Integer duracaoEmMinutos;

    private Integer anoLancamento;

    private String genero;

    public Filme(String nome, Integer duracao, Integer ano, String genero) {
        this.nome = nome;
        this.duracaoEmMinutos = duracao;
        this.anoLancamento = ano;
        this.genero = genero;
    }

    public Filme(DadosCadastroFilme dados) {

        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoLancamento = dados.ano();
        this.genero = dados.genero();

    }

    public Filme() {
    }

    public void atualizaDados(DadosAlteracaoFilme dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoLancamento = dados.ano();
        this.genero = dados.genero();
    }

    public String toString() {
        return "Filme: " + this.nome + " - " + this.duracaoEmMinutos + " minutos - " + this.anoLancamento + " - "
                + this.genero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public Long getId() {
        return id;
    }

}
