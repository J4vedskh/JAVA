class Solution {
    public int strStr(String haystack, String needle) {

        if (needle == null || needle.trim().isEmpty() || haystack == null || haystack.trim().isEmpty()
                || haystack.length() < needle.length()) {
            return -1;

        }
        int j = 0;
        int k = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) != needle.charAt(j)) {
                i = i-k;
                j = 0;
                k=0;
            } else if (j == needle.length() - 1) {
                return i - k;
            } else if (haystack.charAt(i) == needle.charAt(j)){
                j++;
                k++;
            }

        }
        return -1;
    }
}