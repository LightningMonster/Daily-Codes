
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(input);
        System.out.println("Length of longest substring: " + result);
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int finalSize = 0;
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int index = temp.indexOf(String.valueOf(ch));
            if (index != -1) {
                temp.delete(0, index + 1);
            }

            temp.append(ch); // add current character

            finalSize = Math.max(finalSize, temp.length()); // update max
        }

        return finalSize;
    }
}