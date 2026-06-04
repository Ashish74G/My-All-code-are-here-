class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];
        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }
        int ans = -1;
        int minFreq = Integer.MAX_VALUE;
        for (int digit = 0; digit <= 9; digit++) {
            if (freq[digit] > 0 && freq[digit] < minFreq) {
                minFreq = freq[digit];
                ans = digit;
            }
        }
        return ans;
    }
}