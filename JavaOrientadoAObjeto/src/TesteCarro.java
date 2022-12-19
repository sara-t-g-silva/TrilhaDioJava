import java.util.Scanner;

public class TesteCarro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Carro carroTeste = new Carro();

        carroTeste.capacidadeTanque = scan.nextInt();
        carroTeste.valorGasolina = scan.nextDouble();

        System.out.println(carroTeste.valorTotal(carroTeste.valorGasolina));

        
        
    }
    
}
