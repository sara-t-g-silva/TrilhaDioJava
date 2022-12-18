import java.util.*;
 
public class PercentualDesconto{

public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
		
    int M = input.nextInt();
    int S = input.nextInt();  

    int porcentagem = (S*100)/M; //quanto é a porcentagem de s em relação a m.
    int desconto = 100 - porcentagem;

    System.out.println("O desconto foi de " + desconto+"%");
    
    
    

    
   
  
}
}
