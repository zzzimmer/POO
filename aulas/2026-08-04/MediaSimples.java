import java.util.Scanner;

public class MediaSimples{
    public static void main(String[] args){
        //o nome das variaveis 
        Scanner sc = new Scanner(System.in);
        double n1, n2;

        System.out.println("Entre com suas duas notas e receba a média simples: ");

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();

        System.out.println("A sua nota foi: " + Math.round(((n1+n2)/2)));
    }
}