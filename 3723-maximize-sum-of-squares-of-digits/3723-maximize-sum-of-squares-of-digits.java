class Solution {
    public String maxSumOfSquares(int num, int sum) {
        // If the maximum possible sum with 'num' digits (9 * num) is less than 'sum', 
        // or if sum is less than 0, it's impossible.
        if ((long) num * 9 < sum || sum < 0) {
            return "";
        }
        
        char[] result = new char[num];
        
        for (int i = 0; i < num; i++) {
            // Try the largest possible digit for the current position (up to 9 or remaining sum)
            int d = Math.min(9, sum);
            
            // Ensure that taking this digit still leaves enough sum for the remaining positions
            while (d >= 0) {
                if (sum - d <= (num - 1 - i) * 9) {
                    break;
                }
                d--;
            }
            
            if (d < 0) {
                return "";
            }
            
            result[i] = (char) ('0' + d);
            sum -= d;
        }
        
        return sum == 0 ? new String(result) : "";
    }
}