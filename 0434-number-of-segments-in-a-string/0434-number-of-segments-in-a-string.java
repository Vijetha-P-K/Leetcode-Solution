 class Solution {
    public int countSegments(String s) {
        if (s == null || s.isBlank()) {
            return 0;
        }
        String[] segments = s.trim().split("\\s+");
        return segments.length;
    }
}
