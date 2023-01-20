import java.util.Arrays;
import java.util.Scanner;

public class DiferencaEntreDigitos {
	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);

	     int numero = scan.nextInt();

	     String numeroEmString = String.valueOf(numero);
	     String[] split = numeroEmString.split("");

	     int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();
	     
	     int produto = 1;     //P = Produto de digitos
         int soma = 0;       // S = Soma dos dígitos
         int resultado = 0;  // R = P - S

         if (numero !=0){
             for (int i=0; i < ints.length; i++){
                 produto = produto * ints[i];
                 soma = soma + ints[i];
                 resultado = produto - soma;
             }

             System.out.println(resultado);
         }else{
             System.out.println("Digite valor diferente de Zero.");
         }
	}

}
