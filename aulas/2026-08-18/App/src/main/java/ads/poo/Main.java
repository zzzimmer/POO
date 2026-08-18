package ads.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carro fusca = new Carro();

        fusca.acelerar(20);

        System.out.println("A velocidade é: "+ fusca.obterVelocidadeAtual());


    }
}