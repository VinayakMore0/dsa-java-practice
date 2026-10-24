import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        int n = src.nextInt();
        int ans = 0;

        while(n > 0){
            int rem = n % 10;
            n /= 10;
            ans = (ans * 10) + rem;
        }

        System.out.println(ans);

    }
}
