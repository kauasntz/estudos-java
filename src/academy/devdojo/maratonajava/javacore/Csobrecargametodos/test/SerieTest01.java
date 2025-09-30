package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Serie;

public class SerieTest01 {
    public static void main(String[] args) {
        Serie serie1 = new Serie("Twin Peaks", "Série", 12, "Mistério");
        Serie serie2 = new Serie();

        serie1.imprime();
        serie2.imprime();
    }
}
