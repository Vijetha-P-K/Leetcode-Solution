class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        int zeroIndex = -1;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                zeroIndex = i;
                if (zeroCount > 1) {
                    return ans;
                }
            } else {
                product *= nums[i];
            }
        }

        if (zeroCount == 1) {
            ans[zeroIndex] = product;
            return ans;
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = product / nums[i];
        }
        return ans;
    }
}
    