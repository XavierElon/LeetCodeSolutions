
class Solution {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        HashMap<Character, Integer> counts = new HashMap<>();
        
        int length = s.length();
        
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < length; i++) {
            if (counts.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
