import java.util.Scanner;

/*Faça um programa que calcule a fatorial de um número inteiro fornecido pelo usuário
 * ex.: 5! = 120 (5x4x3x2x1); com laço for
 */

public class Fatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        

        int fatorial;
        int multiplicacao = 1;


        System.out.println("Digite o número que deseja fatorar: ");
        fatorial = scan.nextInt();
        System.out.print(fatorial + "! = " );

        for(int i = fatorial;i>=1;i--){

            multiplicacao *= i;

        }

        System.out.println(multiplicacao);
    }
    
}
