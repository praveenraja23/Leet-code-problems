class Solution{
public void rotate(int[]nums,int k){
   int arr[] = nums.clone();
   int n = arr.length;
   int ind = 0;
   k%=n;
   for(int i=n-k;i<n;i++)
   {
    nums[ind++] = arr[i];
   }
   for(int i=0;i<n-k;i++)
   {
    nums[ind++] = arr[i];
   }
}
}