import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();
        
        double mediaIdade= (idade1+idade2+idade3)/3;
        
          if(mediaIdade>=0 && mediaIdade<=25){
            System.out.println("Jovem!");
        }else if(mediaIdade>25 && mediaIdade<=60){
            System.out.println("Adulta!");
        }else{
            System.out.println("Idosa!");
       


 //TODO: Implemente um condição de verifique a média de idade da turma conforme a descrição do desafio:
       
    }
}
}