import java.util.Arrays;

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long totalOps = (long) k1 + k2;
        
        int maxDiff = 0;
        int[] diffs = new int[n];
        for (int i = 0; i < n; i++) {
            diffs[i] = Math.abs(nums1[i] - nums2[i]);
            if (diffs[i] > maxDiff) {
                maxDiff = diffs[i];
            }
        }
        long[] count = new long[maxDiff + 1];
        for (int d : diffs) {
            count[d]++;
        }
        for (int d = maxDiff; d > 0 && totalOps > 0; d--) {
            if (count[d] == 0) continue;
            long opsToUse = Math.min(totalOps, count[d]);
            
            count[d] -= opsToUse;
            count[d - 1] += opsToUse;
            totalOps -= opsToUse;
        }
        long minSumSqDiff = 0;
        for (int d = 1; d <= maxDiff; d++) {
            if (count[d] > 0) {
                minSumSqDiff += count[d] * (long) d * d;
            }
        }
        
        return minSumSqDiff;
    }
}