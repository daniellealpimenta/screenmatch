package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {

    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento, boolean incluidoNoPlano, int temporadas, int episodiosPorTemporada, boolean ativa, int minutosPorEpisodio)
    {
        super(nome, anoDeLancamento, incluidoNoPlano);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.ativa = ativa;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("O número de temporadas é: " + getTemporadas());
        System.out.println("O número de Episódios por temporada é: " + getEpisodiosPorTemporada());
        System.out.println("A série está ativa? " + (isAtiva() ? "sim" : "não"));
        System.out.println("Cada episódio tem: " + getMinutosPorEpisodio() + " min");
        System.out.println("O tamanho da série em minutos é: " + getDuracaoEmMinutos() + " min");
    }

    @Override
    public int getClassificacao() {
        return (int) obterMediaDasAvaliacoes() / 2;
    }
}
