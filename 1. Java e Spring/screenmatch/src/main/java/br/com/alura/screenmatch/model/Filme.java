package br.com.alura.screenmatch.model;

public class Filme {

    private String titulo;
    private String duracaoEmMinutos;
    private String anoLancamento;
    private String genero;

    public Filme(String titulo, String duracao, String ano, String genero) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracao;
        this.anoLancamento = ano;
        this.genero = genero;
    }

    public Filme(DadosCadastroFilme dados){

        this.titulo = dados.titulo();
        this.duracaoEmMinutos = dados.duracao();
        this.anoLancamento = dados.ano();
        this.genero = dados.genero();

    }

    public String toString(){
        return "Filme: " + this.titulo + " - " + this.duracaoEmMinutos + " minutos - " + this.anoLancamento + " - " + this.genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public String getGenero() {
        return genero;
    }
    
}
