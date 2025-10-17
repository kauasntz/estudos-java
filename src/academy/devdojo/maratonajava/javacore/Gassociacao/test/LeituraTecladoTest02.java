package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Software de previsao do futuro");
        System.out.println("Digite sua pergunta");

        String pergunta = input.nextLine();

        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }
}
