class Solution {
    public void sortColors(int[] nums) {
        int k=0, r, i, n=nums.length;
        r=n-1;
        for(i=0; i<n; i++) {
            if(nums[i]==0)
                k++;
            if(nums[i]==2)
                r--;
        }
        for(i=0; i<n; i++) {
            if(i<k)
                nums[i]=0;
            else if(i<=r)
                nums[i]=1;
            else
                nums[i]=2;
        }
    }
}
