class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] m = new int[n];
        int[] len = new int[n];
        for (int i = 0; i < n; i++) {
            int b = 0;
            for (char c : words[i].toCharArray()) {
                b |= 1 << (c - 'a'); 
            }
            m[i] = b;
            len[i] = words[i].length();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((m[i] & m[j]) == 0) {
                    max = Math.max(max, len[i] * len[j]);
                }
            }
        }
        return max;
    }
}