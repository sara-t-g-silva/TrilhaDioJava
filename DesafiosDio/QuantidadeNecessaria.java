import java.util.Scanner;

public class QuantidadeNecessaria {
  public static void main(String[] args) {
    final int SLICE = 4;
    Scanner scanner = new Scanner(System.in);

    int T = scanner.nextInt();

        // TODO: Retorne o número de pizzas necessárias para atender o pedido. 
        
               for(int i = 1; i <= T; i++) {
                double amigos = scanner.nextInt() * scanner.nextInt();
                double nPizzas = Math.ceil(amigos / SLICE);

                System.out.println((int)nPizzas);
            }
            scanner.close();
        }
}