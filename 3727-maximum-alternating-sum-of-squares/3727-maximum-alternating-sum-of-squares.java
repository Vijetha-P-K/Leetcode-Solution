import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squared = new long[n];
        for (int i = 0; i < n; i++) {
            long val = Math.abs((long) nums[i]);
            squared[i] = val * val;
        }
        Arrays.sort(squared);
        
        long score = 0;
        boolean add = true; 
        int left = 0, right = n - 1;
        while (left <= right) {
            if (add) {
                score += squared[right];
                right--;
            } else {
                score -= squared[left];
                left++;
            }
            add = !add;
        }
        
        return score;
    }
}