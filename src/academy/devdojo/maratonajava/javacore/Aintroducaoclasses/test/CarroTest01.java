package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.marca = "Ford";
        carro1.modelo = "Ka";
        carro1.ano = 2011;

        carro2.marca = "Fiat";
        carro2.modelo = "Uno";
        carro2.ano = 2005;

        carro3.marca = "Toyota";
        carro3.modelo = "Corolla";
        carro3.ano = 2020;

        System.out.println("Carro: " + carro1.marca + " " + carro1.modelo + " " + carro1.ano);
        System.out.println("Carro: " + carro2.marca + " " + carro2.modelo + " " + carro2.ano);
        System.out.println("Carro: " + carro3.marca + " " + carro3.modelo + " " + carro3.ano);
    }
}
