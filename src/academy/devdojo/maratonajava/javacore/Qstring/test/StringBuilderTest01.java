package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {

        String nome = "Guarda";
        nome.concat("-chuva");

        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Guarda");
        sb.append("-chuva").append(" azul");
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);


    }
}
