package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio extends Serie implements Classificavel {

    private int numero;
    private String nomeEP;
    private String serie;
    private int totalVisualizacoes;

    public Episodio(String nome, int anoDeLancamento, boolean incluidoNoPlano, int temporadas, int episodiosPorTemporada,
                    boolean ativa, int minutosPorEpisodio, int numero, String nomeEP, int totalVisualizacoes) {
        super(nome, anoDeLancamento, incluidoNoPlano, temporadas, episodiosPorTemporada, ativa, minutosPorEpisodio);
        this.serie = nome;
        this.numero = numero;
        this.nomeEP = nomeEP;
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeEP() {
        return nomeEP;
    }

    public String getSerie() {
        return serie;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("\nO nome do episódio é: " + getNomeEP());
        System.out.println("O número do episódio é" + getNumero());
        System.out.println("A série que o ep pertence é: " + getSerie());
    }

    @Override
    public int getClassificacao() {
        return  totalVisualizacoes > 100 ? 4 : 2;
    }
}
