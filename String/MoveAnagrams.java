
import java.util.*;

class MoveAnagrams {

    private static String getKey(String word, boolean sort) {
        if (sort) {

            // Approach 1 - O(k*log(k)) -> Due to sorting of characters in word
            char[] sortedWord = word.toLowerCase().toCharArray();
            Arrays.sort(sortedWord);
            return String.valueOf(sortedWord);
        } else {

            // Approach 2 - O(k) -> Iterating of characters in word -> Efficient
            int[] counter = new int[26];
            for (char c : word.toLowerCase().toCharArray()) {
                counter[c - 'a']++;
            }
            return Arrays.toString(counter);
        }
    }

    public static List<String> moveAnagramsToLeft(List<String> words) {

        if (words == null) {
            return new ArrayList<>();
        }
        List<String> anagramList = new ArrayList<>();
        List<String> nonAnagramList = new ArrayList<>();

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            if (word == null) {
                continue;
            }
            String key = getKey(word, false);
            List<String> group = anagramMap.computeIfAbsent(key, k -> new ArrayList<String>());
            group.add(word);
        }

        for (Map.Entry<String, List<String>> entry : anagramMap.entrySet()) {
            if (entry.getValue().size() < 2) {
                nonAnagramList.addAll(entry.getValue());
            } else {
                anagramList.addAll(entry.getValue());
            }
        }
        anagramList.addAll(nonAnagramList);
        return anagramList;
    }

    public static void main(String[] args) {
        List<String> words_1 = Arrays.asList("Listen", "hello", "arun", "test", "Silent", "nest", "enlist", "world", "dlorw");
        List<String> words_2 = Arrays.asList();

        // Moves anagrams to left side of the list
        System.out.println(moveAnagramsToLeft(words_1));
    }
}
