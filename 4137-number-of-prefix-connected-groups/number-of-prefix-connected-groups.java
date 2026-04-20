import java.util.*;

class Solution {
    public int prefixConnected(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        
        // Count prefixes
        for (String word : words) {
            if (word.length() >= k) {
                String prefix = word.substring(0, k);
                map.put(prefix, map.getOrDefault(prefix, 0) + 1);
            }
        }
        
        int group = 0;
        
        // Count valid groups
        for (int count : map.values()) {
            if (count > 1) {
                group++;
            }
        }
        
        return group;
    }
}