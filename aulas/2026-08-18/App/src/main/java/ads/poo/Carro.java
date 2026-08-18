package ads.poo;

public class Carro {

    private long velocidadeAtual = 10;

    public void acelerar(long velocidade){

        if ((velocidadeAtual+ velocidade)>100){
            velocidadeAtual = 100;
        }else {
            velocidadeAtual +=velocidade;
        }
    }

    public long obterVelocidadeAtual(){
        return velocidadeAtual;
    }

}
