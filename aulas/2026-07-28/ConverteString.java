import java.util.Scanner;

public class ConverteString {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Exemplo de redirecionamento de entrada em java");

        while (entrada.hasNext()){
            String s = entrada.nextLine();
            System.out.println("Foi digitado no prompt: "+s);
        }
    }
}