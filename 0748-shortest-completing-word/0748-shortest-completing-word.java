
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        // Step 1: Count required letters from licensePlate
        int[] required = new int[26];
        for (char ch : licensePlate.toCharArray()) {
            if (Character.isLetter(ch)) {
                required[Character.toLowerCase(ch) - 'a']++;
            }
        }

        String result = null;

        // Step 2: Check each word
        for (String word : words) {
            if (covers(word, required)) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }
        return result;
    }

    // Helper function: check if word covers all required letters
    private boolean covers(String word, int[] required) {
        int[] count = new int[26];
        for (char ch : word.toCharArray()) {
            count[Character.toLowerCase(ch) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] < required[i]) {
                return false;
            }
        }
        return true;
    }
}
