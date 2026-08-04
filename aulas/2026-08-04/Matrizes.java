import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [][] matriz = new int[3][3];
        //int ultimoIndice = 2;

        // entrada

        for(int i = 0 ; i < matriz.length; i++){    
            for(int j = 0 ; j < matriz[i].length; j++){
                IO.print(String.format("Digite as notas do %d  aluno",i));
                matriz [i][j] = sc.nextInt();
                //matriz [i][ultimoIndice] += matriz [i][j]; 
            }
        }

        sc.close();

        //impressao e calc media

        for(int i = 0 ; i < matriz.length; i++){
            matriz [i][] =     
            for(int j = 0 ; j < matriz[i].length; j++){
                
                 
            }
        }

    }
}