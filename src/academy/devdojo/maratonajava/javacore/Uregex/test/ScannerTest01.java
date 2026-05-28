package academy.devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Julian, Albert, Nikolai, Fabrizio, Nick";
        String[] nomes = texto.split(",");
        //String[] nomes = texto.split("\\d");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

    }
}
