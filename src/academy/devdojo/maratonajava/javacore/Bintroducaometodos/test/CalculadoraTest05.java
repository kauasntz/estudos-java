package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};

        Calculadora calculadora = new Calculadora();
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,5,7,11);
    }
}
