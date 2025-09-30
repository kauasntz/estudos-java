package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class TestFuncionario01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Kaua");
        funcionario.setIdade(21);
        funcionario.setSalarios(new double[]{2000, 5000, 10000});

        funcionario.imprimeDados();
        funcionario.calculaMediaSalarios();
    }
}
