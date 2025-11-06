package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Ronaldo", 4000 );
        Desenvolvedor desenvolvedor = new Desenvolvedor("El Pepe", 10000 );

        System.out.println(gerente.toString());
        System.out.println(desenvolvedor.toString());
    }
}
