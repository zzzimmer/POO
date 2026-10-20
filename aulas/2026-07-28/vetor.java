public class vetor {
    public static void main(String[] args) {

//        int [] [] vetorBidi = new int [2] [3]; ou então:
        int [] [] vetorBidi = {{ 1, 2, 3}, {4, 5, 6}};

//        System.out.println(vetorBidi.length);
//        System.out.println(vetorBidi[1].length);

        for (int i = 0; i<vetorBidi.length; i ++){
            for (int j = 0; j<vetorBidi[i].length; j++){
                System.out.println(vetorBidi[i][j]);
            }
        }
    }
}