class matrikspenjumlahan {
    public static void main(String[] args) {
        int matrix1[][] = new int[2][2];
        matrix1[0][0] = 5;
        matrix1[0][1] = 0;
        matrix1[1][0] = 2;
        matrix1[1][1] = 6;

        int matrix2[][] = new int[2][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 0;
        matrix2[1][0] = 4;
        matrix2[1][1] = 2;

        for (int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[0].length; j++){
                int elem = matrix1[i][j] + matrix2[i][j];
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}