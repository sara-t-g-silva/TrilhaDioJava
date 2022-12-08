import java.util.Scanner;

/*Faça um programa que leia 5 números,
 * informe o maior número e
 * a média desses números
 */

public class MaiorEMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int numero;
        int count = 0;
        int maior=0;
        int soma = 0;


        do{
            System.out.println("Numero:  ");
            numero = scan.nextInt();

            soma = soma +numero;
            if(numero>maior){
                maior=numero;
            }

        
        count++;

        }while(count<5);

        System.out.println("Maior número é: " + maior);
        System.out.println("A soma desses  números é: " + soma);
        

    }
}
