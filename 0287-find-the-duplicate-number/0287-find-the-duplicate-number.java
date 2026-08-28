class Solution {
    public int findDuplicate(int[] nums) {

        int n1 = nums[0];
        int n2 = nums[0];

        do {
            n1 = nums[n1];
            n2 = nums[nums[n2]];
        } while (n1 != n2);
        n1 = nums[0];
        while (n1 != n2) {
            n1 = nums[n1];
            n2 = nums[n2];
        }
        return n1; 
    }   
}