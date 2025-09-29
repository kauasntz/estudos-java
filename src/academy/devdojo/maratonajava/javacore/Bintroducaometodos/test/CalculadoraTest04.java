package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void  main(String[] args) {
        Calculadora calc = new Calculadora();
        int x = 1;
        int y = 2;
        // no metodo
        calc.alteraDoisNumeros(x, y);

        // no CalculadoraTest04
        System.out.println(x + ", " + y);
    }
}
