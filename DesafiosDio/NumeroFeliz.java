import java.util.*;


public class NumeroFeliz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
           
           scan.close();
           System.out.println(EstaFeliz(n));
       }

       public static boolean EstaFeliz(int n) {
        String texto = String.valueOf(n);
        if(texto.length() == 1) {
            return Integer.parseInt(texto) == 1;
        } do {
            String[] vetor = texto.split("");
            int soma = 0;
            for (int x = 0; x < vetor.length; x++) {
                int valor = Integer.parseInt(vetor[x]);
                soma += (valor * valor);
            }
            String somaString = String.valueOf(soma);
            if(somaString.length() == 1) {
                return Integer.parseInt(somaString) == 1;
            }
            texto = somaString;
        } while (texto.length() != 1);
        return false;
       }
}