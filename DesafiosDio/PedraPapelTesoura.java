import java.util.Scanner;


public class PedraPapelTesoura {
	
	public static void main(String[] args) {
		 Scanner leitor = new Scanner(System.in);  

	      int jogadaJogador = leitor.nextInt();  
	      int jogadaInimigo = leitor.nextInt();
	      
	      if (jogadaJogador == jogadaInimigo)
	          System.out.println("Empatou");
	          else if (jogadaJogador == 1 && jogadaInimigo == 2)
	              System.out.println("Perdeu");
	          else if (jogadaJogador == 3 && jogadaInimigo == 2)
	              System.out.println("Ganhou");
	          else if (jogadaJogador == 2 && jogadaInimigo == 3)
	              System.out.println("Perdeu");
	          else if (jogadaJogador == 1 && jogadaInimigo == 3)
	              System.out.println("Ganhou");
	          else if (jogadaJogador == 2 && jogadaInimigo == 1)
	              System.out.println("Ganhou");
	          }
	}


