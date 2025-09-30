package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somarDoisNumeros() {
        System.out.println(10+10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public double divideDoisNumeros(double n1, double n2) {
        if(n2 == 0) {
            System.out.println("Indefinido.");
            return 0;
        } else {
            return n1 / n2;
        }
    }

    public void imprimeDivisaoDeDoisNumeros(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Indefinido.");
            return;
        }
            System.out.println(n1 + " / " + n2 + " = " + n1/n2);
    }

    public void alteraDoisNumeros(int n1, int n2) {
        n1 = 99;
        n2 = 33;
        System.out.println("Dentro do metodo:");
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int...numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
