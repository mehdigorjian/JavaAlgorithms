public class MatrixMulti {
    public static void main(String[] args) {
        int[][] A = new int[3][4];
        int[][] B = new int[3][4];

        A[0][0] = 1;
        A[0][1] = 2;
        A[0][2] = 3;
        A[0][3] = 4;

        A[1][0] = 1;
        A[1][1] = 2;
        A[1][2] = 3;
        A[1][3] = 4;

        A[2][0] = 1;
        A[2][1] = 2;
        A[2][2] = 3;
        A[2][3] = 4;

        B[0][0] = 10;
        B[0][1] = 20;
        B[0][2] = 30;
        B[0][3] = 40;

        B[1][0] = 10;
        B[1][1] = 20;
        B[1][2] = 30;
        B[1][3] = 40;

        B[2][0] = 10;
        B[2][1] = 20;
        B[2][2] = 30;
        B[2][3] = 40;

        int[][] C = new int[3][4];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = 0;
                for (int k = 0; k < A.length; k++) {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }

        for (int[] ele : C) {
            for (int sub : ele) {
                System.out.format("%03d ", sub);
            }
            System.out.println();
        }
    }
}
