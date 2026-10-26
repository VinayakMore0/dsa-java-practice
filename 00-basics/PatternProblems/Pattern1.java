import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int trow = scn.nextInt();

        for (int row = 1; row <= trow; row++) {
            for (int cst = 1; cst <= row; cst++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
