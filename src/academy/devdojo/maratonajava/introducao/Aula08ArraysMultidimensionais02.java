package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main (String[] args) {
        int[][] numeros = new int[3][];
        int[][] numeros2 = {{1,2},{3,4,5},{6,7,8,9,10}};

        numeros[0] = new int[2];
        numeros[1] = new int[3];
        numeros[2] = new int[6];

        for(int[] arrayBase : numeros2) {
            for(int num : arrayBase) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }

    }
}
