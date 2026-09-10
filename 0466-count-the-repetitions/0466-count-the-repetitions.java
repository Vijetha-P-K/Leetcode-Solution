class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int count1 = 0;
        int count2 = 0;
        int index = 0;
        int[] seen = new int[s2.length()];
        int[] repeats = new int[s2.length()];
        while (count1 < n1) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == s2.charAt(index)) {
                    index++;
                    if (index == s2.length()) {
                        index = 0;
                        count2++;
                    }
                }
            }
            count1++;
            if (index == 0) {
                if (seen[0] != 0) {
                    int cycle1 = count1 - seen[0];
                    int cycle2 = count2 - repeats[0];
                    int times = (n1 - count1) / cycle1;
                    count1 += times * cycle1;
                    count2 += times * cycle2;
                }
                seen[0] = count1;
                repeats[0] = count2;
            }
        }
        return count2 / n2;
    }
}