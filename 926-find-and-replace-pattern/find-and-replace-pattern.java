class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> matchingWords = new ArrayList<>();
      
        for (String word : words) {
            if (isPatternMatch(word, pattern)) {
                matchingWords.add(word);
            }
        }
      
        return matchingWords;
    }

    private boolean isPatternMatch(String word, String pattern) {
        int[] wordCharMapping = new int[128];
        int[] patternCharMapping = new int[128];
        for (int i = 0; i < word.length(); i++) {
            char wordChar = word.charAt(i);
            char patternChar = pattern.charAt(i);

            if (wordCharMapping[wordChar] != patternCharMapping[patternChar]) {
                return false;
            }
            
            wordCharMapping[wordChar] = i + 1;
            patternCharMapping[patternChar] = i + 1;
        }
      
        return true;
    }
}
