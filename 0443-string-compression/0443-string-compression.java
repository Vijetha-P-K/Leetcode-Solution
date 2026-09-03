class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;  
        int read = 0;   
        while (read < n) {
            char currentChar = chars[read];
            int count = 0;
            while (read < n && chars[read] == currentChar) {
                read++;
                count++;
            }

        
            chars[write] = currentChar;
            write++;

       
            if (count > 1) {
                for (char digit : Integer.toString(count).toCharArray()) {
                    chars[write] = digit;
                    write++;
                }
            }
        }

        
        return write;
    }
}