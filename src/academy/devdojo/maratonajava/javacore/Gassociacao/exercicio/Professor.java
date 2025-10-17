package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio;

public class Professor {
    private String nome;
    private String especialidade;

    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprimir() {
        System.out.println("--- Professor ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (seminarios == null) {
            System.out.println("Esse professor não está ministrando seminários.");
        } else {
            System.out.print("Seminários: ");
            for (Seminario seminario : seminarios) {
                System.out.print(seminario.getTitulo() + ", ");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
