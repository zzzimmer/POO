import java.util.*;

public class NumeroAleatorio {
    static void main() {

        int aleatorio = java.util.concurrent.
                ThreadLocalRandom.current().
                nextInt(0,101);
        boolean acerto = false;
        Scanner sc = new Scanner(System.in);
        int palpite;
        int tentativas = 1;


        System.out.println("Digite o número aleatório gerado");
        while (acerto == false){
            palpite = sc.nextInt();
            if (palpite == aleatorio){
                System.out.println("acerto");
                System.out.println("Tentativas: "+tentativas);
                acerto = true;
                sc.close();
            } else {
                System.out.println("tente novamente");
                tentativas++;
                if (palpite > aleatorio){
                    System.out.println("o palpite foi maior");
                } else{
                    System.out.println("palpite menor");
                }
            }
        }
    }
}