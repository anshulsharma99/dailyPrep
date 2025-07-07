package arrays.easy;

import java.util.HashMap;

public class TwoSum {

    class Solution {
        public int[] twoSum(int[] nums, int target) {

            int[] answer = new int[2];
            HashMap<Integer,Integer> numberToIndex = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int desiredNumber = target-nums[i];
                if(numberToIndex.containsKey(desiredNumber)){
                    answer[0] = numberToIndex.get(desiredNumber);
                    answer[1]=i;
                    break;
                }
                else{
                    numberToIndex.put(nums[i],i);
                }
            }
            return answer;

        }
    }

    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        int[] nums = {2, 11, 7, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
