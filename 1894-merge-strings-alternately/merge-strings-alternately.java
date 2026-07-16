class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();

        StringBuilder mergeResult = new StringBuilder();

        for(int i = 0; i < word1Length || i < word2Length; i++){
            if( i < word1Length){
                mergeResult.append(word1.charAt(i));
            }

            if(i < word2Length){
                mergeResult.append(word2.charAt(i));
            }

        }
        return mergeResult.toString();
    }
}