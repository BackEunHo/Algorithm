
import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 151. Reverse Words in a String
 * https://leetcode.com/problems/reverse-words-in-a-string/
 */
class Solution {

    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        // Extract words
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                currentWord.append(c);
            } else if (currentWord.length() > 0) {
                words.add(currentWord.toString());
                currentWord = new StringBuilder();
            }
        }

        // Handle the last word
        if (currentWord.length() > 0) {
            words.add(currentWord.toString());
        }

        // Place words in reverse order
        StringBuilder result = new StringBuilder();
        for (int i = words.size() - 1; i >= 0; i--) {
            result.append(words.get(i));
            if (i > 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}

/**
 * Main class with test cases
 */
class ReverseWordsInString {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Basic case
        String test1 = "the sky is blue";
        System.out.println("Test 1: \"" + test1 + "\"");
        System.out.println("Result: \"" + solution.reverseWords(test1) + "\"");
        System.out.println("Expected: \"blue is sky the\"");
        System.out.println();

        // Test case 2: Leading and trailing spaces
        String test2 = "  hello world  ";
        System.out.println("Test 2: \"" + test2 + "\"");
        System.out.println("Result: \"" + solution.reverseWords(test2) + "\"");
        System.out.println("Expected: \"world hello\"");
        System.out.println();

        // Test case 3: Multiple spaces between words
        String test3 = "a good   example";
        System.out.println("Test 3: \"" + test3 + "\"");
        System.out.println("Result: \"" + solution.reverseWords(test3) + "\"");
        System.out.println("Expected: \"example good a\"");
        System.out.println();

        // Test case 4: Empty string
        String test4 = "";
        System.out.println("Test 4: \"" + test4 + "\"");
        System.out.println("Result: \"" + solution.reverseWords(test4) + "\"");
        System.out.println("Expected: \"\"");
        System.out.println();

        // Test case 5: Only spaces
        String test5 = "   ";
        System.out.println("Test 5: \"" + test5 + "\"");
        System.out.println("Result: \"" + solution.reverseWords(test5) + "\"");
        System.out.println("Expected: \"\"");
        System.out.println();

        // Test case 6: Single word
        String test6 = "hello";
        System.out.println("Test 6: \"" + test6 + "\"");
        System.out.println("Result: \"" + solution.reverseWords(test6) + "\"");
        System.out.println("Expected: \"hello\"");
    }
}
