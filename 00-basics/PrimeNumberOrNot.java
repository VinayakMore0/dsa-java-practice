import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int n = src.nextInt();
        int div = 2;
        int flag = 0;

        while (div <= n - 1) {
            if (n % div == 0 ) {
                flag = 1;
                break;
            }
            div += 1;
        }
        if (flag == 1) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

    }
}
