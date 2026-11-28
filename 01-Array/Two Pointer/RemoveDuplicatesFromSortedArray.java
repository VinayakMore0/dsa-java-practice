public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {2,2,3,4,5,5,7,7,9};

        int iIdx = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[iIdx] = nums[i];
                iIdx++;
            }
        }

        System.out.println(iIdx);
        for (int val : nums) {
            System.out.print(val + " ");
        }
    }
}
