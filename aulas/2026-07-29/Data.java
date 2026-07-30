import java.util.Scanner;

public class Data{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//      Array dias = new ArrayList[];
        String[] diasDaSemana = new String[5];
        String siglaMateria;
        int i = 0;
        String diaDeclarado;

        System.out.println("Digite a sigla da dis");
        siglaMateria = sc.nextLine();

        System.out.println("--------");
        System.out.println("Que dias da semana você tem aulas de " + siglaMateria +"?");

        while (i<5) {

            System.out.println("Informe o dia da semana da sua aula ou N para encerrar");
            diaDeclarado = sc.nextLine();
            // diaDeclarado = diaDeclarado.toUpperCase();
            if (
            diaDeclarado.equals("seg") ||
            diaDeclarado.equals("ter") ||
            diaDeclarado.equals("qua") ||
            diaDeclarado.equals("qui") ||
            diaDeclarado.equals("sex")  ) {
                
                diasDaSemana[i] = diaDeclarado;
                i++;    

            }else if (diaDeclarado.equals("n")) {
                i = 6;

            }else{
                System.out.println("--------");
                System.out.println("nome do dia da semana invalido");
                System.out.println("entradas validas: seg, ter, qua, qui, sex ou n para encerrar");
                System.out.println("--------");
            }
            
        }

        System.out.println("--------"); 
        System.out.println("Na disciplina de "+siglaMateria+" você em aula nos seguintes dias: ");

        int j = diasDaSemana.length;

        for(int a = 0; a<j; a++){

            if (diasDaSemana[a] == null) {
                
            }else
            System.out.println(diasDaSemana[a]);
        }

    }
}