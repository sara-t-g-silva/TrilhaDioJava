import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String resposta;
		resposta = scan.next();
		
		if(resposta == "sim") {
			System.out.println("ok");
			
		}else if(resposta == "nao"){
			System.out.println("não");
		}
		
	}
}

