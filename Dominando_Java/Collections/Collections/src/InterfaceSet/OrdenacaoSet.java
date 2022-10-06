package InterfaceSet;

import java.util.*;

public class OrdenacaoSet {
    public static void main(String[] args) {
//        Dados as seguintes informações sobre minhas séries favoritas,
//        crie um conjunto e ordene este conjunto exibindo:
//        (nome - gênero - tempo de episódio);

//        Série 1 = Nome: GOT, genero: fantasia, tempoEpisodio: 60
//        Série 2 = Nome: Dark, genero: drama, tempoEpisodio: 60
//        Série 3 = Nome: Breaking Bad, genero: drama, tempoEpisodio: 60

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("GOT", "fantasia", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("Breaking Bad", "fantasia", 90));
        }};
        for(Serie serie : minhasSeries) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("======================================================");
        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("GOT", "fantasia", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("Breaking Bad", "drama", 90));
        }};
        for(Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("======================================================");
        System.out.println("--\tOrdem natural\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries1);
        for(Serie serie : minhasSeries3) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("======================================================");
        System.out.println("--\tOrdem aleatória\t--");

    }
}

