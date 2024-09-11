package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public Filme(String nome, int anoDeLancamento, boolean incluidoNoPlano, int duracaoEmMinutos, String diretor) {
        super(nome, anoDeLancamento, incluidoNoPlano);
        this.diretor = diretor;
        setDuracaoEmMinutos(duracaoEmMinutos);
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("O diretor do filme é: " + getDiretor());
    }

    @Override
    public int getClassificacao() {
        return (int) obterMediaDasAvaliacoes() / 2;
    }
}
