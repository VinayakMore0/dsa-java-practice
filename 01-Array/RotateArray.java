import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};
        display(arr);
        System.out.println("Enter times of rotation: ");
        int r = scn.nextInt();
        rotateEle(arr, r);
    }

    public static void display(int[] arr) {
        for (int val: arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void rotateEle(int[] arr, int k) {
        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }
        for (int i = 1; i <= k; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        display(arr);
    }

}
