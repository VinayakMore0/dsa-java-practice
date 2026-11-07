public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };

        for (int[] val : matrix) {
            for (int temp : val) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
        System.out.println();

        int m = matrix.length;
        int n = matrix[0].length;
        boolean isRow = false;
        boolean isCol = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    if (i == 0) isRow = true;
                    if (j == 0) isCol = true;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (isRow) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }

        if (isCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }

        for (int[] val : matrix) {
            for (int temp : val) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }

    }
}
