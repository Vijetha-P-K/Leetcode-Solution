class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean asc = true;
        boolean dsc = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) asc = false;
            if (nums[i] < nums[i + 1]) dsc = false;
        }
        return asc || dsc; 
    }
}