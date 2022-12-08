import java.util.Scanner;

/*Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares 
 * e a quantidade de números ímpares.
 */

public class ParImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    
        int quantnumeros;
        int numero;
        int count = 0;
        int quantidadePares =0;
        int quantidadeImpares = 0;



        System.out.println("Quantidade de números:  ");
        quantnumeros = scan.nextInt();

        do{
            System.out.println("numero: ");
            numero = scan.nextInt();

            if(numero % 2 == 0){
                quantidadePares++;
            }else{
                quantidadeImpares++;
            }
            count++;

        }while(count< quantnumeros);


        System.out.println("Quantidade de números pares: "+quantidadePares);
        System.out.println("Quantidade de números impares " + quantidadeImpares);


    }
}
