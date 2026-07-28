import java.util.Scanner;

public class OlaMundo {
  public static void main(String[] args) {
    
    char genero;
    int idade;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu gênero (M ou F): ");
    genero = scanner.next().charAt(0);

    System.out.println("Digite sua idade");
    idade = scanner.nextInt();

    genero = Character.toUpperCase(genero);

    if (genero == 'M' && idade >= 18) {
        System.out.println("Apresente seu certificado de reservista");
    }else{
      System.out.println("Não precisa apresentar certificado de reservista");
    }

  }
}