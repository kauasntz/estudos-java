package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

//        for(int i = 0; i < dias.length; i++) {
//            for(int j = 0; j < dias.length; j++) {
//                System.out.print(dias[i][j] + " ");
//            }
//            System.out.println("");
//        }

        for(int[] arrBase : dias) {
            for(int num : arrBase) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }

    }
}
