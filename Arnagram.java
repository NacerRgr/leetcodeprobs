import java.util.Arrays;

public class Arnagram {

    public static void main(String[] args) {
        String s = "cba";
        String t = "abc";
        System.out.println(new Arnagram().isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        // Initialize the character array to track matched characters
        char[] chArray = new char[t.length()];

        // Iterate through characters in s
        for (int i = 0; i < s.length(); i++) {
            boolean matched = false;

            // Compare each character in s with characters in t
            for (int j = 0; j < t.length(); j++) {

                // Match the character only if the spot in chArray is empty (use '\u0000')
                if (s.charAt(i) == t.charAt(j) && chArray[j] == '\u0000') {
                    chArray[j] = s.charAt(i);  // Assign matched character to chArray[j]
                    matched = true;
                    System.err.println(Arrays.toString(chArray)); // Debugging
                    break;  // Stop inner loop after finding the match
                }
            }

            // If no match was found for s.charAt(i), return false (early exit)
            if (!matched) {
                return false;
            }
        }

        // Final check: If all characters are matched, the anagram condition is met
        String str = new String(chArray);
        return str.equals(t);
    }
}
