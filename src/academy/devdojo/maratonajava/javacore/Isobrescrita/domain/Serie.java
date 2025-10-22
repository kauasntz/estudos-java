package academy.devdojo.maratonajava.javacore.Isobrescrita.domain;

public class Serie {
    private String nome;

    public Serie(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
