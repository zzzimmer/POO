package ads.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Caneta bic = new Caneta(100);

        bic.desenhar(10,30,40,50);

        System.out.println(bic.getCargaDeTinta());

    }
}