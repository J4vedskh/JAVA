class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int previous = 1; // ways(1)
        int current = 2;  // ways(2)

        for (int step = 3; step <= n; step++) {
            int next = previous + current;
            previous = current;
            current = next;
        }

        return current;
    }
}