package arrays.medium;

public class SortColor {
    class Solution {
        public void sortColors(int[] nums) {

            int totalOnes = 0;
            int totalZeros = 0;
            int totalTwos = 0;

            for(int num : nums){
                if(num==0){
                    totalZeros++;
                }
                else if(num==1){
                    totalOnes++;
                }
                else{
                    totalTwos++;
                }
            }
            int currentIndex = 0;
            while(totalZeros!=0){
                nums[currentIndex]=0;
                currentIndex++;
                totalZeros--;
            }
            while(totalOnes!=0){
                nums[currentIndex] = 1;
                currentIndex++;
                totalOnes--;
            }
            while(totalTwos!=0){
                nums[currentIndex]=2;
                currentIndex++;
                totalTwos--;
            }

        }
    }

    public static void main(String[] args) {
        Solution solution = new SortColor().new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
