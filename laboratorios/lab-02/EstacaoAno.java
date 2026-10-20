public class EstacaoAno {
    static void main() {

//        Faça um programa que leia do teclado um número inteiro que representa o dia, e
//        uma string que representa o mês. Por fim, imprima na tela a estação do ano correspondente aqui no
//        Brasil.

        String estacaoAno;

        System.out.println("Entre com o dia: ");
        int dia;
        System.out.println("Entre com o mês por texto: ");
        String mes;

        mes = mes.toLowerCase();

        if (mes.equals("março")){
            if (dia <= 20){
                estacaoAno = "Outono"
            } else {
                estacaoAno = "Verão"
            }
        } else if ("junho") {
            if (dia <= 20){
                estacaoAno = "Inverno"
            } else {
                estacaoAno = "Outono"
            }
        } else if ("setembro") {
            if (dia <= 22){
                estacaoAno = "Primavera"
            } else {
                estacaoAno = "Inverno"
            }
        } else {
            if (dia <= 22){
                estacaoAno = "Verão"
            } else {
                estacaoAno = "Primavera"
            }
        }


    }
}