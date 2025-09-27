package academy.devdojo.maratonajava.introducao;

import java.time.LocalDate;
import java.util.Date;

/*
Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de R$ <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Kauã";
        String endereco = "Rua Roger Waters, 1973";
        float salario = 5400.75F;
        LocalDate data = LocalDate.of(2025, 9, 5);

        System.out.println("Eu " + nome + ", morando no endereço " + endereco +
                ", confirmo que recebi o salário de R$" + salario + ", na data " + data + ".");
    }
}
