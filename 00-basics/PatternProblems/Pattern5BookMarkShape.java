import java.util.Scanner;

public class Pattern5BookMarkShape {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int frow = 1; frow <= n * 2 - 1; frow++) {
            System.out.print("* ");
        }
        System.out.println();

        int trow = n - 1;
        int stars = n - 1;
        int spaces = 1;

        for (int row = 1; row <= trow; row++) {
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("* ");
            }
            for (int csp = 1; csp <= spaces; csp++) {
                System.out.print("  ");
            }
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("* ");
            }
            System.out.println();
            stars--;
            spaces += 2;
        }



    }
}
