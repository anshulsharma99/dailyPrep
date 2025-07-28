package arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
    class Solution {

        public String encode(List<String> strs) {
            if(strs.size()==0){
                return "0#";
            }
            StringBuilder encodedString = new StringBuilder();

            for (String word : strs) {
                encodedString.append(word.length()).append("#").append(word);
            }
            return encodedString.toString();

        }

        public List<String> decode(String str) {
            if(str.equals("0#")){
                return List.of("");
            }
            List<String> decodedStrings = new ArrayList<>();
            int currentPointer = 0;
            while (currentPointer < str.length()) {

                String c = String.valueOf(str.charAt(currentPointer));
                try {
                    int numberOfCharactersToRead = Integer.parseInt(c);
                    if (currentPointer + 1 < str.length() - 1) {
                        char delimiter = str.charAt(currentPointer + 1);
                        if (delimiter == '#') {
                            String decodedString = str.substring(currentPointer + 2, currentPointer +2 + numberOfCharactersToRead);
                            decodedStrings.add(decodedString);
                            currentPointer = currentPointer + numberOfCharactersToRead;
                        }
                    }

                } catch (NumberFormatException e) {
                    // not an integer
                }


                currentPointer++;
            }
            return decodedStrings;

        }
    }



    public static void main(String[] args) {
        Solution solution = new EncodeDecode().new Solution();
        List<String> strs = List.of("");
        String encoded = solution.encode(strs);
        System.out.println("Encoded: " + encoded);
        List<String> decoded = solution.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }

}
