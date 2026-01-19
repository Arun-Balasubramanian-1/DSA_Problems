
import java.util.*;

class CheckAnagram {

    public static boolean checkAnagram(String s1, String s2) {

        if ((s1 == null) || (s2 == null) || (s1.length() != s2.length())) {
            return false;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] count = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)] += 1;
        }

        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i)] -= 1;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkAnagramWithMap(String s1, String s2) {

        if ((s1 == null) || (s2 == null) || (s1.length() != s2.length())) {
            return false;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        Map<Character, Integer> charCount = new HashMap<>();

        for (Character c : s1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Character c : s2.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) - 1);
        }

        for (Integer count : charCount.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "Sheep";
        String s2 = "peshe";
        boolean result = checkAnagram(s1, s2);
        System.out.println("Are the two strings anagrams -" + s1 + " and " + s2 + " are anagrams? " + result);
    }
}
