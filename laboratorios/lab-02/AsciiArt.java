import java.util.Scanner;

public class AsciiArt {

    static void main() {

        int largura;
        Scanner sc = new Scanner(System.in);
        int escolha;
        int altura;

        System.out.println("Escolha o tipo de saida 1 tri; 2 losang e 3 quadrado");
        escolha = sc.nextInt();

        switch (escolha){
            case 1 -> {
                        System.out.println("Digite a altura");
                        altura = sc.nextInt();
                        triangulo(altura);
            }
            case 3 ->
                    {
                        System.out.println("Digite a largura");
                        largura = sc.nextInt();
                        System.out.println("Digite a altura");
                        altura = sc.nextInt();
                        retangulo(largura, altura);
                    }
           case 2 -> {
               System.out.println("Digite a largura");
               largura = sc.nextInt();
               losangulo(largura);
           }
        }

    }

    public static void losangulo(int largura){
        String base = "";
        for (int i = 0; i<largura; i++){
            base = base+"*";
        }
        System.out.println(base);
        for (int i = 0; i<largura; i++){
            base = base-"*";
        }
    }

    public static void triangulo(int altura){
        String triangulo = "*";
        for (int i = 0;i<altura;i++){
            System.out.println(triangulo);
            triangulo = triangulo+"*";
        }
    }

    public static void retangulo(int largura, int altura){
        String baseRet = "";
        String corpoRet = "*";

        //monta a base
        for (int i = 0;i<largura;i++){
            baseRet = baseRet + "*";
        }

        //imprime parte superior
        System.out.println(baseRet);

//        monta corpo do retangulo
        for (int i = 0; i<(largura-2);i++){
            corpoRet = corpoRet + " ";
        }

//        imprime o corpo
        for (int j = 0; j <altura; j++){
            System.out.print(corpoRet+"*");
            System.out.println("");
        }

        //imprime base
        System.out.println(baseRet);
    }

}