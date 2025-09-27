package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        double numero1 = 10;
        double numero2 = 20;

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;



        System.out.println(numero1 + " + " + numero2 + " = " + soma);
        System.out.println(numero1 + " - " + numero2 + " = " + subtracao);
        System.out.println(numero1 + " x " + numero2 + " = " + multiplicacao);
        System.out.println(numero1 + " / " + numero2 + " = " + divisao);

        // resto %
        int resto = 10 % 3;
        System.out.println(resto);

        // > < >= <= == !=
        boolean isNumero1MaiorQueNumero2 = numero1 > numero2;
        System.out.println("n1 > n2? " + isNumero1MaiorQueNumero2);

        // &&(and) ||(or) !(not)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLei = idade > 30 && salario >= 4612;

        System.out.println(isDentroDaLei);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorVideogame = 5000;

        boolean isVideogameCompravel = valorTotalContaCorrente > valorVideogame || valorTotalContaPoupanca > valorVideogame;
        System.out.println(isVideogameCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);



    }
}
