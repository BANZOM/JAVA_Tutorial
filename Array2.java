class Array_2D {
    public int[][] Integer_array(int row, int col) {
        int arr[][] = new int[row][col];
        return arr;
    }
}


public class Array2 {
    public static void main(String[] args) {
        Array_2D a = new Array_2D();
        int[][] b = a.Integer_array(2, 3);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j]);
                System.out.print(",");
            }
            System.out.println();
        }
    }
}
