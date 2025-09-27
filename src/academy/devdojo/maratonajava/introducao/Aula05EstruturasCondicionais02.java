package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15: infantil
        // idade >= 15 && idade < 18: juvenil
        // idade >= 18: adulto

        int idade = 11;
        if(idade < 15){
            System.out.println("Categoria infantil");
        } else if(idade >= 15 && idade < 18){
            System.out.println("Categoria juvenil");
        } else {
            System.out.println("Categoria adulto");
        }

    }
}
