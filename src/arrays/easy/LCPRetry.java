package arrays.easy;

import java.util.Arrays;

public class LCPRetry {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);
            String lcp = "";
            String firstWord = strs[0];
            String lastWord = strs[strs.length-1];
            int pointer = 0;
            while(pointer<firstWord.length() && pointer<lastWord.length()){
                if(firstWord.charAt(pointer)==lastWord.charAt(pointer)){
                    lcp = "%s%s".formatted(lcp, firstWord.charAt(pointer));
                }
                else{
                    break;
                }
                pointer++;
            }
            return lcp;
        }
    }

    public static void main(String[] args) {
        Solution solution = new LCPRetry().new Solution();
        String[] strs ={"neet","feet"};
        String result = solution.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }
}
