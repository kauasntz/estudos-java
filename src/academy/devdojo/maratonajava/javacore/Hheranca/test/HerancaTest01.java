package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        endereco1.setRua("Abbey Road");
        endereco1.setCep("000000-001");
        Endereco endereco2 = new Endereco();
        endereco2.setRua("Grunge St.");
        endereco2.setCep("000000-002");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ringo Starr");
        pessoa.setCpf("123.456.789-10");
        pessoa.setEndereco(endereco1);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Layne Stanley");
        funcionario.setCpf("000.000.000-01");
        funcionario.setEndereco(endereco2);
        funcionario.setSalario(7500);
        funcionario.imprime();

    }
}
