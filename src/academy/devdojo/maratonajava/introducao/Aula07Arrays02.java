package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float, double: 0/0.0
        // char: '\u0000' ' '
        // boolean: false
        // String: null

        String[] nomes = new String[4];

        nomes[0] = "Ana";
        nomes[1] = "Bernardo";
        nomes[2] = "Caio";
        nomes[3] = "Dennis";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
