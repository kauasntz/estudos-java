package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Serie;

public class SerieTest01 {
    public static void main(String[] args) {
        Serie serie = new Serie("The Office");

        for (int episodio: serie.getEpisodios()){
            System.out.print(episodio + " ");
        }
    }
}
