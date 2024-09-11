import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.models.Episodio;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Como Treinar o Seu Dragão", 2010, true, 180, "Jonas brother");
        Serie serie1 = new Serie("Brookylin 99", 2008, true, 5, 28, true, 25);

        filme1.avalia(10.0);
        filme1.avalia(9.9);
        filme1.avalia(9.8);
        filme1.avalia(10.0);

        filme1.exibeFichaTecnica();

        serie1.avalia(10.0);
        serie1.avalia(9.0);
        serie1.avalia(9.0);
        serie1.avalia(8.0);
        serie1.avalia(7.0);
        serie1.avalia(9.5);

        serie1.exibeFichaTecnica();

        CalculadoraDeTempo calcularora = new CalculadoraDeTempo();

        calcularora.inclui(filme1);
        calcularora.inclui(serie1);
        System.out.println("\nDuracao total: " + calcularora.getTempoTotal() + " horas");

        Episodio ep1 = new Episodio("Brookylin 99", 2008, true, 5, 28, true, 25,
                1, "Peralta Vence a Aposta", 5000);

        ep1.exibeFichaTecnica();

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        System.out.println("\nO filme: " + filme1.getNome());
        filtro.filtra(filme1);
        System.out.println("\nA série: " + serie1.getNome());
        filtro.filtra(serie1);
        System.out.println("\nO episódio: " + ep1.getNomeEP());
        filtro.filtra(ep1);

    }
}