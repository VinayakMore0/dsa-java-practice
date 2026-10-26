import java.util.Scanner;

public class Pattern2FullPyramid {
    public static void main(String[] args) {
        Scanner srn = new Scanner(System.in);

        int trows = srn.nextInt();
        int spaces = trows - 1;
        int stars = 1;

        for(int rows = 1; rows <= trows; rows++) {
            for (int csp = 1; csp <= spaces; csp++) {
                System.out.print("  ");
            }
            for (int cst = 1; cst <= stars; cst++) {
                System.out.print("* ");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }

    }
}
