class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[0] && nums[i]!=nums[n-1]){
                return nums[i];
               
            }
        }
        return -1;
    }
}