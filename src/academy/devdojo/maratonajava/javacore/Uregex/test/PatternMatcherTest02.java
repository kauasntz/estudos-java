package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Todos não digitos
        // \s = Espaços em branco \t n \f \r
        // \S = Todos caracteres excluindo os brancos
        // \w = a-Z A-Z, digitos, _
        // \W = Tudo que nao for incluso no \w

        String regex = "\\S";
//        String texto = "abaaba";
        String texto2 = "a 1b2c3";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto:  "+ texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posicoes encontradas:");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " +matcher.group() + "\n");
        }

    }
}
