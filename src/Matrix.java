import java.util.Arrays;
public class Matrix {
    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {// rows

            for (int j = 0; j < matrix[i].length; j++) {//column
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");// newline
        }
    }
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4},
                {9, 13, 5, 4},
                {6, 0, 13, 17},
                {3, 21, 8, 15},};
        printMatrix(matrix);//display
    }
}