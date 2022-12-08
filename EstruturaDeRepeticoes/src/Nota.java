import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido
 * continue pedindo até que o usuário informe um valor válido
 */
public class Nota {

    public static void main (String []args){

        Scanner scan = new Scanner(System.in);

        
        int nota;

        System.out.println("Nota:  ");
        nota = scan.nextInt();

        while(nota>10 || nota<0){

            System.out.println("valor inválido, insira uma nota válida");
            System.out.println("Nota:  ");
            nota = scan.nextInt();
        }

        


    }

}
