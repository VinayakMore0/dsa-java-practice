import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        System.out.println(isArmstrongNumber(n));

        // Between Two Numbers

        int lo = scn.nextInt();
        int hi = scn.nextInt();

        printArmstrongNumbers(lo, hi);

    }

    public static void printArmstrongNumbers(int lo, int hi) {
        for (int i = lo; i <= hi; i++) {
            boolean res = isArmstrongNumber(i);
            if (res) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrongNumber(int n) {
        int nod = countDigits(n);
        int on = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, nod);
            n /= 10;
        }

        if (sum == on) {
            return true;
        } else {
            return false;
        }
    }

    public static int countDigits(int n) {
        int nod = 0;
        while (n > 0) {
            n /= 10;
            nod++;
        }
        return nod;
    }
}
