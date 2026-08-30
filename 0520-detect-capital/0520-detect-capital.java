class Solution {
    public boolean detectCapitalUse(String word) {
        char[] c = word.toCharArray();

        boolean allUpper = true;
        boolean allLower = true;

        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A' && c[i] <= 'Z') {
                allLower = false;
            } else {
                allUpper = false;
            }
        }

        boolean firstUpperRestLower = true;

        if (!(c[0] >= 'A' && c[0] <= 'Z')) {
            firstUpperRestLower = false;
        }

        for (int i = 1; i < c.length; i++) {
            if (c[i] >= 'A' && c[i] <= 'Z') {
                firstUpperRestLower = false;
                break;
            }
        }

        return allUpper || allLower || firstUpperRestLower;
    }
}
