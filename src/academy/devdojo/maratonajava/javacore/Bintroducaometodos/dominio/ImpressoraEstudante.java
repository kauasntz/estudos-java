package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime (Estudante student) {

        System.out.println(student.nome + ", " + student.idade + ", " + student.sexo);
        student.nome = "Paul";
    }
}
