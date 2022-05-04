class Solution {
    public int removeDuplicates(int[] nums) {
        int i, k=1, n=nums.length;
        for(i=1; i<n; i++) {
            if(nums[i]!=nums[i-1]) {
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}
