package arrays.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

     static class Solution {
        public static String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);
            String longestCommonPrefix = strs[0];
            var isFirstWord = true;

            for(String word : strs){

                if(isFirstWord){
                    isFirstWord = false;
                    continue;
                }

                int currentPointer = 0;
                String longestCommonPrefixCopy = longestCommonPrefix;
                longestCommonPrefix = "";

                for(int i=0;i<longestCommonPrefixCopy.length() && i< word.length() ;i++){
                    if(longestCommonPrefixCopy.charAt(currentPointer) == word.charAt(currentPointer)){
                        longestCommonPrefix = "%s%s".formatted(longestCommonPrefix, word.charAt(currentPointer));
                        currentPointer++;
                    }
                    else{
                        break;
                    }
                }
            }

            return longestCommonPrefix;
        }
    }

    public void main(String[] args){
        String[] strs = {"ab","a"};
        String s = Solution.longestCommonPrefix(strs);
        System.out.println("ans : %s".formatted(s));
    }
}
