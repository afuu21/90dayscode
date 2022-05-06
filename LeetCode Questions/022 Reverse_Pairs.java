class Solution {
    public int reversePairs(int[] nums) {
        int count=0, i, j;
        long ans_1, ans_2;
        for(i=0; i<nums.length; i++)
            for(j=i+1; j<nums.length; j++) {
                ans_1 = new Long(nums[i]);
                ans_2 = new Long(nums[j]*2);
                if(ans_1>ans_2)
                    count++;
            }
        return count;
    }
}
