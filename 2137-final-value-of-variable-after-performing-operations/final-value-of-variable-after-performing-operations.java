class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int value=0;
        for(String str:operations){
            if(str.contains("++")){
                value++;
            }
            else{
                value--;
            }}
            return value;
        
    }
}