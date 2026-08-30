class Solution {
    public int findMinDifference(List<String> timePoints) {

        int n = timePoints.size();
        int[] minutes = new int[n];
        for (int i = 0; i < n; i++) {
            String[] parts = timePoints.get(i).split(":");
            int h = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            minutes[i] = h * 60 + m;
        }
        Arrays.sort(minutes);
        int minDiff = 24 * 60 - (minutes[n - 1] - minutes[0]);
        for (int i = 1; i < n; i++) {
            minDiff = Math.min(minDiff, minutes[i] - minutes[i - 1]);
        }

        return minDiff;
    }
}