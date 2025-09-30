package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class TestFuncionario01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Kauã";
        funcionario.idade = 21;
        funcionario.salarios = new double[]{1200, 1500, 2000};

        funcionario.imprimeDados();
        funcionario.calculaMediaSalarios();



    }
}
