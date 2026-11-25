import java.util.Arrays;

class Solution {
    public int[] closestPrimes(int left, int right) {
        if (right < 2) {
            return new int[] {-1, -1};
        }
        boolean[] isPrime = new boolean[right + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i * i <= right; i++) {
            if(isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int prevPrime = -1;
        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[] {-1 , -1};

        for(int i = Math.max(2, left); i <= right; i++) {
            if (isPrime[i]) {
                if (prevPrime != -1 && (i - prevPrime) < minDiff) {
                    minDiff = i - prevPrime;
                    result[0] = prevPrime;
                    result[1] = i;
                }
                if (minDiff <= 2) {
                    return result;
                }
                prevPrime = i;
            }
        }
        return result;
    }
}