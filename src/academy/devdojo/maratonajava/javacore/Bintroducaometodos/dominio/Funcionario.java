package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome = null;
    public int idade = 0;
    public double[] salarios = null;

    public void imprimeDados() {
        System.out.println(this.nome + ", " + this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
    }

    public void calculaMediaSalarios() {
        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia dos saalários: R$" + media);
    }
}