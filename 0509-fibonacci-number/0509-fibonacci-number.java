class Solution {
    public int fib(int n) {
        int curr = 0;
        int prev1 = 1;
        int prev2 = 0;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        for (int i = 2; i <= n; i++) {
            curr = prev2 + prev1;
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
}