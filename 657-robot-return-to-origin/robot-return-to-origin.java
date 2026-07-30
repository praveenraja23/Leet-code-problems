class Solution {
    public boolean judgeCircle(String str) {
        int count=0;
        int count1=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='U'){
              count++;
            }
            else if(str.charAt(i)=='D'){
              count--;
            }
            else if(str.charAt(i)=='R'){
              count1++;
            }
            else if(str.charAt(i)=='L'){
              count1--;
            }
           
        }
         if(count==0 && count1==0){
                return true;
            }
            return false;
    }
}