package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));

        System.out.println("Fim");
    }

    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new RuntimeException("Não se pode dividir por 0.");
        }
        return a/b;
    }

}
