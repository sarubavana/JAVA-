import java.util.*;

class sec {
    public static void main(String[] args) {
        // code for main method
    }

    public String findMismatchedString(String[] words) {
        int n = words[0].length();
        int[] commonDifference = new int[n-1];
        // Calculate common difference array
        for (int i = 0; i < n-1; i++) {
            commonDifference[i] = words[0].charAt(i+1) - words[0].charAt(i);
        }
        // Check all strings for different difference array
        for (String word : words) {
            int[] difference = new int[n-1];
            for (int i = 0; i < n-1; i++) {
                difference[i] = word.charAt(i+1) - word.charAt(i);
            }
            if (!Arrays.equals(difference, commonDifference)) {
                return word;
            }
        }
        // No mismatch found
        return null;
    }
}
