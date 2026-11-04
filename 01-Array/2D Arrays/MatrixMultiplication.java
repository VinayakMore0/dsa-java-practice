public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] one = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] two = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] ans = new int[one.length][two[0].length];

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < one[0].length; k++) {
                    int temp = one[i][k] * two[k][j];
                    sum += temp;
                }
                ans[i][j] = sum;
            }
        }

        for (int[] val : ans) {
            for (int temp : val) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }

    }
}
