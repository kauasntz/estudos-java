package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Ringo";
        estudante01.idade = 87;
        estudante01.sexo = 'M';

        estudante02.nome = "George";
        estudante02.idade = 40;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
