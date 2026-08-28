class Solution {
    public String reverseVowels(String s) {

        char c[] = s.toCharArray();
        int st=0;
        int en=s.length()-1;
        String str="aeiouAEIOU";
        while(st<en)
        {
            while(!str.contains(String.valueOf(c[st]))&& st<en)
            {
                st++;
            }
            while(!str.contains(String.valueOf(c[en]))&& st<en)
            {
                en--;
            }
            char temp = c[st];
            c[st] = c[en];
            c[en] = temp;
            st++;
            en--;
        }
        return new String(c);
    }
}