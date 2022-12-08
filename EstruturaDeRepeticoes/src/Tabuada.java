import java.util.Scanner;

/*Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro entre 0 a 10.
 * o usuário deve informar de qual número ele deseja ver a tabuada.
 * a saída deve ser conforme o exemplo abaixo
 * 
 * 
 * tabuada de 5
 * 5x1=5
 * 5x2=10
 * ...
 * 5x10=50
 */

public class Tabuada {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número para receber a tabuada: ");
        numero = scan.nextInt();

        System.out.println("A tabuada de " + numero);


        for(int i=1;i<=10;i++){

            System.out.println( numero+ "X" + i + " = " + (numero*i));

        }
        



    }
    
}
