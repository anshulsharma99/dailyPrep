package arrays.medium;

public class SortColorOnePass {
    class Solution {
        public void sortColors(int[] nums) {
            int l=0;
            int r = nums.length-1;

            for(int i=0;i<=r;i++){
                if(nums[i]==0){
                    swap(i,l,nums);
                    l++;
                }
                if(nums[i]==2){
                    swap(i,r,nums);
                    r--;
                    i--;

                }
            }

        }
        public void swap(int i, int j,int[]nums){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
        Solution solution = new SortColorOnePass().new Solution();
        int[] nums = {0,1,2,0};
        solution.sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}
