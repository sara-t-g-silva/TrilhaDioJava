package ExercíciosFixacao;

public class Main {

    public static void main(String[] args) {
        
        Bola bola = new Bola("rosa",3.60,"Borracha");// teste class Bola

        System.out.println(bola.mostrarCor());

        bola.trocarCor("preto");

        System.out.println(bola.mostrarCor());

        Quadrado quadrado = new Quadrado();

        quadrado.setLado(20);
        System.out.println(quadrado.calcularArea());

        


        

        

    }
    
}
