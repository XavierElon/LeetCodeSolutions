class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] char_map = new int[26];
        
        for (int i = 0; i < order.length(); i++) {
            char_map[order.charAt(i) - 'a'] = i;
        }
        
        search: for (int i = 0; i < words.length-1; i++) {
            String word1 = words[i];
            String word2 = words[i+1];
            
                for (int n = 0; n < Math.min(word1.length(), word2.length()); n++) {
                    if (word1.charAt(n) != word2.charAt(n)) {
                        System.out.println("word 1= " + char_map[word1.charAt(n) - 'a'] + " " + word1.charAt(n));
                        System.out.println("word 2= " + char_map[word2.charAt(n) - 'a'] + " " + word2.charAt(n));
                        
                        if (char_map[word1.charAt(n) - 'a'] > char_map[word2.charAt(n) - 'a']) {
                            return false;
                        }
                        continue search;
                    }
                }
            if (word1.length() > word2.length()) {
                return false;
            }
        }
        return true;
    }
}
