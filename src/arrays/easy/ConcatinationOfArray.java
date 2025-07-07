package arrays.easy;

import java.util.ArrayList;

public class ConcatinationOfArray {

    class Solution {
        public int[] getConcatenation(int[] nums) {

            int n = nums.length;
            int[] answer = new int[2*n];

            for(int i=0;i<n;i++){
                answer[i] = nums[i];
                answer[i+n] = nums[i];
            }
            return answer;


        }
    }

    public static void main(String[] args) {
        Solution solution = new ConcatinationOfArray().new Solution();
        int[] nums = {0,0,0};
        int[] result = solution.getConcatenation(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
