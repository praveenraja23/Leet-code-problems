class Solution {
    public int countCommas(int n) {
        int ans=1;
         ans +=n-1000;
         if(ans>0){
            return ans;
         }
         return 0;
    }
}