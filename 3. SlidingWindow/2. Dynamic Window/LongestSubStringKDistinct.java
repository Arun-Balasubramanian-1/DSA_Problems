import java.util.HashMap;
import java.util.Map;

public class LongestSubStringKDistinct {

    public static int findLongestSubStringWithKDistinctCharacters(String str, int k) {
        int result = Integer.MIN_VALUE;
        int start = 0;
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (int end = 0; end < str.length(); end++) {
            charFrequency.put(str.charAt(end), charFrequency.getOrDefault(str.charAt(end), 0) + 1);

            while (charFrequency.size() > k) {
                char leftChar = str.charAt(start);
                charFrequency.put(leftChar, charFrequency.get(leftChar) - 1);
                if (charFrequency.get(leftChar) == 0) {
                    charFrequency.remove(leftChar);
                }
                start++;
            }

            result = Math.max(result, end - start + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "araaci";
        int k = 2;

        int result = findLongestSubStringWithKDistinctCharacters(str, k);

        System.out.println("LongestSubStringKDistinct: " + result);
    }
}