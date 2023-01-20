package ExercíciosFixacao;

public class Bola {

    String cor;
    Double circunferencia;
    String material;


    public Bola(String cor, Double circunferencia, String material) { // setando as características da bola no construtor
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    public void trocarCor (String cor){
        this.cor = cor;
    }

    public String mostrarCor(){
        return cor;
    }


    


    
}
