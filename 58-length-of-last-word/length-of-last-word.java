class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            while(i>=0&&s.charAt(i)!=' ')
            {
                count ++;
                i--;
            }
            break;
        }
        return count;
    }
}