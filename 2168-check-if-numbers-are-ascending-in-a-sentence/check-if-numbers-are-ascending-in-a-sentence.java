class Solution {
    public boolean areNumbersAscending(String s) {
        int pre=0;
        for(String word:s.split(" ")){
            if(Character.isDigit(word.charAt(0))){
                int n=Integer.parseInt(word);
            
            if(n<=pre){
                return false;
            }
            pre=n;
            }
    }
    return true;
}}