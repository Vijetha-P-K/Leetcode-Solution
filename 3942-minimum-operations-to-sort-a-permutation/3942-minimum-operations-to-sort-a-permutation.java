public class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return 0;
        }

        // Find the index of 0
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                idx = i;
                break;
            }
        }

        // Check if the array is cyclically increasing to the right
        boolean isInc = true;
        for (int i = 0; i < n; i++) {
            if (nums[(idx + i) % n] != i) {
                isInc = false;
                break;
            }
        }

        // Check if the array is cyclically decreasing to the right (increasing to the left)
        boolean isDec = true;
        for (int i = 0; i < n; i++) {
            if (nums[(idx - i + n) % n] != i) {
                isDec = false;
                break;
            }
        }

        int minOps = Integer.MAX_VALUE;

        // If it is increasing, find the minimum between direct rotation and reverse-rotate-reverse
        if (isInc) {
            minOps = Math.min(minOps, Math.min(idx, n - idx + 2));
        }

        // If it is decreasing, find the minimum between rotate-reverse and reverse-rotate
        if (isDec) {
            minOps = Math.min(minOps, Math.min(idx + 2, n - idx));
        }

        return minOps == Integer.MAX_VALUE ? -1 : minOps;
    }
}
