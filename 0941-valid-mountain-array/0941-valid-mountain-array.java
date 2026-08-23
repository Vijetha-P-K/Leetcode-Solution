class Solution {
    public static boolean validMountainArray(int nums[]) {
        if (nums.length < 3) return false;
        int max = Integer.MIN_VALUE;
        int ind = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                ind = i;
            }
        }
        if (ind == 0 || ind == nums.length - 1) return false; 
        for (int j = 0; j < ind; j++) {
            if (nums[j] >= nums[j + 1]) return false;
        }
        for (int k = ind; k < nums.length - 1; k++) {
            if (nums[k] <= nums[k + 1]) return false;
        }
        return true;
    }
}
