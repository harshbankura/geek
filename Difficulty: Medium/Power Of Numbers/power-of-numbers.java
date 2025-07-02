class Solution {
    public int reverseExponentiation(int n) {
         int rev = reverse(n);
        return (int) power(n, rev); 
        // code here
        
    }
    static int MOD = 1000000007;

    // Function to reverse a number
    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    // Function to compute (n^r) % MOD using recursion
    static long power(long n, long r) {
        if (r == 0)
            return 1;
        long halfPower = power(n, r / 2) % MOD;
        long result = (halfPower * halfPower) % MOD;
        if (r % 2 == 1)
            result = (result * n) % MOD;
        return result;
    }
}
