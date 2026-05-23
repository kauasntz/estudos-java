package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Todos não digitos
        // \s = Espaços em branco \t n \f \r
        // \S = Todos caracteres excluindo os brancos
        // \w = a-Z A-Z, digitos, _
        // \W = Tudo que nao for incluso no \w
        // []
        // ? Zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n, m} de n a m
        // ()
        // | o(v|c)o  ovo | oco
        // $

        String regex = "0[xX]([0-9a-fA-fA-F])+\\s|$";
        String texto2 = "12 0x 0X 0xFFABC 0x10G 0x1";
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
