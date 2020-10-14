public class AnagramCheck {

    private final static char[] PUNCTUATION_MARKS = ".!?,;:".toCharArray();

    public static boolean isAnagram(String word, String anagram, boolean caseSensitive, boolean punctuationMarkSensitve) {
        if (word.length() != anagram.length()) {
            return false;
        }

        if (!caseSensitive){
            word = word.toLowerCase();
            anagram = anagram.toLowerCase();
        }

        if (!punctuationMarkSensitve) {
            for (char punctuationMark : PUNCTUATION_MARKS) {
                word.replace(punctuationMark, "");
                anagram.replace(punctuationMark, '');
            }
        }

        char[] chars = word.toCharArray();

        for (char c : chars) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else {
                return false;
            }
        }

        return anagram.isEmpty();
    }
}

