package LongestSubstring.UniqueLongSubstring;
import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        lengthOfLongestSubstring(input);
    }

    public static void lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int l = 0;
        int start = 0; // To store starting index of longest substring
        HashMap<Character, Integer> position = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            char current = s.charAt(r);

            if (position.containsKey(current)) {
                l = Math.max(l, position.get(current) + 1);
            }

            position.put(current, r);

            if (maxLen < (r - l + 1)) {
                maxLen = r - l + 1;
                start = l;
            }
        }

        String longestSubstring = s.substring(start, start + maxLen);
        System.out.println("Length of the longest substring without repeating characters: " + maxLen);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
    }
}
