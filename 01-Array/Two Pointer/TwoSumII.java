public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {-1,0,2,7,11,15};
        int target = 9;
        int[] twoSum = new int[2];

        int low = 0;
        int high = numbers.length - 1;

        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum  == target) {
                twoSum = new int[] {low + 1, high + 1};
                break;
            } else if (sum < target) {
                low ++;
            } else {
                high --;
            }
        }

        for (int val : twoSum) {
            System.out.print(val + " ");
        }
    }
}
