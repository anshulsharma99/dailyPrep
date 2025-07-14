package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer,Integer> totalOccurrences = new HashMap<>();

            for(int num : nums){
                totalOccurrences.put(num,totalOccurrences.getOrDefault(num,0)+1);
            }

            int maxOccurrence = 0;
            int answer = nums[0];

            for (Map.Entry<Integer, Integer> entry : totalOccurrences.entrySet()) {
                Integer k = entry.getKey();
                Integer v = entry.getValue();
                if (v > maxOccurrence) {
                    maxOccurrence = v;
                    answer = k;
                }
            }
            return answer;

        }
    }

    public static void main(String[] args) {
        Solution solution = new MajorityElement().new Solution();
        int[] nums = {1,2,3,2,2,2,5,4,2};
        int result = solution.majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}
