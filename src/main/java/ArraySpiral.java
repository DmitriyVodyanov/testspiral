
public class ArraySpiral {

    public static int[][] createSpiral(int N, int M) {
        int m = M;
        int n = N;
        int firstNumber = 1;
        int x = 1;
        int y = 1;
        int[][] array = new int[m][n];

        for (int i = 0; i < n; i++) {
            array[0][i] = firstNumber;
            firstNumber++;
        }
        for (int i = 1; i < m; i++) {
            array[i][n - 1] = firstNumber;
            firstNumber++;
        }
        for (int i = n - 2; i >= 0; i--) {
            array[m - 1][i] = firstNumber;
            firstNumber++;
        }
        for (int i = m - 2; i > 0; i--) {
            array[i][0] = firstNumber;
            firstNumber++;
        }
        
        while (firstNumber < m * n) {
            while (array[x][y + 1] == 0) {
                array[x][y] = firstNumber;
                firstNumber++;
                y++;
            }
            while (array[x + 1][y] == 0) {
                array[x][y] = firstNumber;
                firstNumber++;
                x++;
            }
            while (array[x][y - 1] == 0) {
                array[x][y] = firstNumber;
                firstNumber++;
                y--;
            }
            while (array[x - 1][y] == 0) {
                array[x][y] = firstNumber;
                firstNumber++;
                x--;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == 0) {
                    array[i][j] = firstNumber;
                }
            }
        }
        return array;
    }
}
