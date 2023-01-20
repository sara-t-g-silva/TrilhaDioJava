package ExercíciosFixacao;

public class Retangulo {

    double base;
    double altura;

    /*Métodos: Mudar valor dos lados, Retornar valor dos lados,
     calcular Área e calcular Perímetro; */

        public void setBase(double base){
            this.base = base;
        }

        public double getBase(){
            return this.base;
        }

        public void setltura(double altura){
            this.altura = altura;
        }

        public double getAltura(){
            return this.altura;
        }

        public double calcularArea(){
            return this.base*this.altura;
        }

        public double calcularPerimetro(){
            return 2*(this.base+this.altura);
        }
}
    

