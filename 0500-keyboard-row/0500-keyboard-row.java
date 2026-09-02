class Solution {
    public String[] findWords(String[] words) {

      String s1 = "qwertyuiopQWERTYUIOP";
      String s2 = "asdfghjklASDFGHJKL";
      String s3 = "zxcvbnmZXCVBNM";

      String str[] = new String[words.length];
      int ind = 0;
      for(String word : words)
      {
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int n = word.length();
        for(char c : word.toCharArray())
        {
            if(s1.contains(String.valueOf(c)))
            {
                c1++;
            }
            else if(s2.contains(String.valueOf(c)))
            {
                c2++;
            }
            else if(s3.contains(String.valueOf(c)))
            {
                c3++;
            }
        }
        if(c1 == n || c2 == n || c3 == n)
        {
            str[ind++] = word;
        }
      }
      String ans[] = new String[ind];
      ind = 0;
      for(String s : str)
      {
        if(s != null)
        {
            ans[ind++] = s;
        }
      }
      return ans;
}
}