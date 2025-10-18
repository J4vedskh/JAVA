class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x; 
        int left = 1;
        int right = x;
        int ans = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
           
            long sq = (long) mid * mid;
            
            if (sq == x) {
                return mid;
            } else if (sq < x) {
                ans = mid;        // mid is a potential answer
                left = mid + 1;   // move right to find a bigger value
            } else {
                right = mid - 1;  // move left
            }
        }
        return ans;
    }
}