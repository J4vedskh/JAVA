class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSize = 0;
        Map<Character, Integer> letterMap = new HashMap<>();
        
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            
            if (letterMap.containsKey(c) && letterMap.get(c) >= left) {
                // Move left just past the previous duplicate
                left = letterMap.get(c) + 1;
            }
            
            // Update last seen index
            letterMap.put(c, right);
            
            // Window length = right - left + 1
            maxSize = Math.max(maxSize, right - left + 1);
        }
        return maxSize;
    }
}