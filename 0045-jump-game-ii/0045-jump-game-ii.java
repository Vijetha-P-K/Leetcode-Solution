class Solution {
    public int jump(int[] nums) {
        int f = 0;
        int j = 0;
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            k = Math.max(k, i + nums[i]);
            if (i == j) {
                f++;
                j = k;
            }
        }
        return f;
    }
}