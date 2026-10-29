public class FindMinEleOfArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 1, 9};
        minimumEle(arr);
    }

    public static void minimumEle (int[] arr) {
        int min = Integer.MAX_VALUE; // or int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
