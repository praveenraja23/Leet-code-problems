class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> ans=new TreeSet<>();
        for(int num: nums){
            ans.add(num);
        }
        int n=ans.size();
        if(n>=3){
        Iterator<Integer> dec=ans.descendingIterator();
        dec.next();
        dec.next();
        return dec.next();
        }
        else{
         return ans.last();
        }
        
    }
}