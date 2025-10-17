package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio;

public class TesteExercicio {
    public static void main(String[] args) {
        Local local1 = new Local("PAP-SI");
        Local local2 = new Local("Pavilhão Central");

        Seminario seminario1 = new Seminario("Perigos da I.A. Generativa", local1);
        Seminario seminario2 = new Seminario("Novidades do Java 25", local2);

        Aluno aluno1 = new Aluno("João", 21);
        Aluno aluno2 = new Aluno("Maria", 23);

        Professor professor1 = new Professor("Alex", "LP");

        local1.imprimir();

        aluno1.setSeminario(seminario1);
        aluno1.imprimir();

        seminario1.setAlunos(new Aluno[]{aluno1, aluno2});
        seminario1.imprimir();

        professor1.setSeminarios(new Seminario[]{seminario1, seminario2});
        professor1.imprimir();
    }
}
