package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Ronaldo"; // String constant pool
        String nome2 = "Ronaldo";

        nome = nome.concat(" Santos");
        System.out.println(nome == nome2);
        System.out.println(nome);

        String nome3 = new String("Ronaldo");
        System.out.println(nome2 == nome3.intern());
    }
}
