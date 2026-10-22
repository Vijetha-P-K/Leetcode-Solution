import java.util.List;

class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] bitCounts = new int[30];
        for (int num : nums) {
            for (int i = 0; i < 30; i++) {
                if ((num & (1 << i)) != 0) {
                    bitCounts[i]++;
                }
            }
        }
        
        long totalSumOfSquares = 0;
        long mod = 1_000_000_007;
        for (int i = 0; i < k; i++) {
            long currentVal = 0;
            for (int bit = 0; bit < 30; bit++) {
                if (bitCounts[bit] > 0) {
                    currentVal |= (1L << bit);
                    bitCounts[bit]--;
                }
            }
            totalSumOfSquares = (totalSumOfSquares + (currentVal * currentVal) % mod) % mod;
        }
        
        return (int) totalSumOfSquares;
    }
}