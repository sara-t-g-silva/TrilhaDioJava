import java.util.Scanner;

public class TesteCarro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Carro carroteste = new Carro();

        carroteste.capacidadeTanque = scan.nextInt();

        carroteste.valorGasolina = scan.nextFloat();

        System.out.println(carroteste.valorTotal(carroteste.valorGasolina));





        




    }
    
}
