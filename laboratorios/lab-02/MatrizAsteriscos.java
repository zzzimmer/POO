import java.util.Random;

public class MatrizAsteriscos {
    static void main() {

        String [][] aleatoria = new String [9][9];
        Random random = new Random();

        int rand;

        for (int i =0; i<9; i++){

            for (int j =0; j<9; j++){
                aleatoria[i][j] = ".";
                rand = random.nextInt(10);
                if (j == rand){
                    aleatoria[i][j] = "*";
                }
                System.out.print(aleatoria[i][j]);
            }
            System.out.println();
        }


    }
}