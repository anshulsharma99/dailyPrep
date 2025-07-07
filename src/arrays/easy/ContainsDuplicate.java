package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    class Solution {
        public boolean hasDuplicate(int[] nums) {
            Map<Integer,Boolean> map = new HashMap<>();
            int n = nums.length;
            for(int i=0;i<n;i++){
                if(map.containsKey(nums[i])){
                    return true;
                }
                map.put(nums[i],true);
            }
            return false;

        }
    }

    public static void main(String[] args) {
        Solution solution = new ContainsDuplicate().new Solution();
        int[] nums = {1, 2, 3, 4};
        boolean result = solution.hasDuplicate(nums);
        System.out.println("Contains duplicate: " + result);
    }
}
