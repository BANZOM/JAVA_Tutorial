class Array_2D {
    public int[][] Integer_array(int row, int col) {
        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = (int)(Math.random() * 10);
            }
        }

        return arr;
    }
}


public class Array2 {
    public static void main(String[] args) {
        Array_2D a = new Array_2D();
        int row = 4;
        int col = 5;
        int[][] b = a.Integer_array(row, col);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(b[i][j]);
                System.out.print(",");
            }
            System.out.println();
        }
    }
}
