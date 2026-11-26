class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int count=0;
        int c=10;
       
        for(int i=n;i>=c;i++){
          count++;
          i=i-c;
          c--;
          i--;
        }
        if(count%2!=0){
            return true;
        }
        return false;

    }
}