package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio;

public class Seminario {
    private String titulo;

    private Local local;
    private Aluno[] alunos;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public void imprimir() {
        System.out.println("--- Seminario ---");
        System.out.println("Título: " + this.titulo);
        System.out.println("Local: " + local.getEndereco());
        if (alunos == null) {
            System.out.println("Esse seminário não possui alunos.");
        } else {
            System.out.print("Alunos: ");
            for (Aluno aluno : alunos) {
                System.out.print(aluno.getNome() + ", ");
            }
            System.out.println("");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}