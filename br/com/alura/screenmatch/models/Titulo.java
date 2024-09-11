package br.com.alura.screenmatch.models;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;



    public Titulo(String nome, int anoDeLancamento, boolean incluidoNoPlano) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("\nNome do título: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.printf("Avaliação: %.2f\n", obterMediaDasAvaliacoes());
        System.out.println("Total de Avaliações: " + getTotalDeAvaliacoes());
        System.out.println("Está incluído no plano? " + (isIncluidoNoPlano() ? "sim" : "não"));
    }

    public void avalia(double nota) {
        this.avaliacao += nota;
        this.totalDeAvaliacoes++;
    }

    public double obterMediaDasAvaliacoes() {
        return avaliacao / totalDeAvaliacoes;
    }
}
