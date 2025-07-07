package arrays.easy;

import java.util.HashMap;

public class ValidAnagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            int firstStringLength = s.length();
            int secondStringLength = t.length();
            if(firstStringLength!=secondStringLength){
                return false;
            }
            HashMap<Character,Integer> firstMap = new HashMap<>();
            HashMap<Character, Integer> secondMap = new HashMap<>();

            for(int i=0;i<s.length();i++){
                firstMap.put(s.charAt(i), firstMap.getOrDefault(s.charAt(i),0)+1);
            }
            for(int i=0;i<t.length();i++){
                secondMap.put(t.charAt(i),secondMap.getOrDefault(t.charAt(i),0)+1);
            }

            if(firstMap.equals(secondMap)){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new ValidAnagram().new Solution();
        String s = "anagram";
        String t = "nagaram";
        boolean result = solution.isAnagram(s, t);
        System.out.println("Is Anagram: " + result);
    }

}
