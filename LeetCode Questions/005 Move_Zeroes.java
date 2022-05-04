class Solution {
    public void moveZeroes(int[] nums) {
        int k=0, i, n=nums.length;
        for(i=0; i<n; i++) 
            if(nums[i]!=0)
                nums[k++]=nums[i];
        for(i=k; i<n; i++)
            nums[i]=0;
    }
}
