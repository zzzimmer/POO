package ads.poo;

public class Contador {

    private int valorAtual ;

    public int getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(int valorAtual) {
        this.valorAtual = valorAtual;
    }

    public void incrementaValorAtual(){
        valorAtual++;
    }

    private void zerarValor(){
        valorAtual = 0;
    }

}
