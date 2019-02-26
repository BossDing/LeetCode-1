package Array;

import org.junit.Test;

public class _48 {
    @Test
    public void Test() {

    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        diagonal_change(n, matrix);
        reverse(n, matrix);

    }

    private static void diagonal_change(int n, int[][] array) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;

            }
        }
    }

    private static void reverse(int n, int[][] array) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                temp = array[i][j];
                array[i][j] = array[i][n - 1 - j];
                array[i][n - 1 - j] = temp;

            }
        }
    }
}
