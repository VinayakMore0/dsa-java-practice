import java.util.ArrayList;

public class RunningSumArray {
    public static void main(String[] args) {
        int[] one = {1, 2, 3};
        System.out.println(runningSumOfArray(one));

    }

    public static ArrayList<Integer> runningSumOfArray (int[] one) {
        ArrayList<Integer> ans = new ArrayList<>();

        int sum = 0;
        int pre = 0;
        int pos = 0;

        for (int i = 0; i < one.length; i++) {
            pre = one[i];
            sum = pre + pos;
            pos = sum;

            ans.add(sum);
        }

        return ans;

        // OR Prefix sum approach

//        int[] nums = one;
//        int[] result = new int[nums.length];
//        result[0] = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            result[i] = result[i - 1] + nums[i];
//        }
//
//        for (int val : result) {
//            System.out.print(val + " ");
//        }

    }
}
