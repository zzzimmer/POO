import java.util.Scanner;

public class EstacaoAno {
    static void main() {

//        Faça um programa que leia do teclado um número inteiro que representa o dia, e
//        uma string que representa o mês. Por fim, imprima na tela a estação do ano correspondente aqui no
//        Brasil.

        Scanner scanner = new Scanner(System.in);
        String estacaoAno;

        System.out.println("Entre com o dia: ");
        int dia = scanner.nextInt();
        System.out.println("Entre com o mês por texto: ");
        String mes = scanner.nextLine();

        mes = mes.toLowerCase();

        if (mes.equals("janeiro") || mes.equals("fevereiro")) {
            estacaoAno = "Verão";
        } else if (mes.equals("abril") || mes.equals("maio")) {
            estacaoAno = "Outono";
        } else if (mes.equals("julho") || mes.equals("agosto")) {
            estacaoAno = "Inverno";
        } else if (mes.equals("outubro") || mes.equals("novembro")) {
            estacaoAno = "Primavera";
        } else if (mes.equals("março")) {
            if (dia <= 20) {
                estacaoAno = "Verão";
            } else {
                estacaoAno = "Outono";
            }
        } else if (mes.equals("junho")) {
            if (dia <= 20) {
                estacaoAno = "Outono";
            } else {
                estacaoAno = "Inverno";
            }
        } else if (mes.equals("setembro")) {
            if (dia <= 22) {
                estacaoAno = "Inverno";
            } else {
                estacaoAno = "Primavera";
            }
        } else if (mes.equals("dezembro")) {
            if (dia <= 21) {
                estacaoAno = "Primavera";
            } else {
                estacaoAno = "Verão";
            }
        } else {
            estacaoAno = "Mês inválido";
        }

        System.out.println("A estação é: " + estacaoAno);

        entrada.close();

        System.out.println("A estação é"+estacaoAno);

    }
}