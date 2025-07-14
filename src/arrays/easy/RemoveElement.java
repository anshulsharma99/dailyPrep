package arrays.easy;

public class RemoveElement {

    class Solution {
        public int removeElement(int[] nums, int val) {
            int nonValIndex = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[nonValIndex] = nums[i];
                    nonValIndex++;
                }
            }
            return nonValIndex;


        }
    }

    public static void main(String[] args) {
        Solution solution = new RemoveElement().new Solution();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = solution.removeElement(nums, val);
        System.out.println("Number of elements after removal: " + result);
    }
}
