class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++) {
            int lo=i+1, hi=nums.length-1, sum=-nums[i];
            while(lo<hi) {
                if(nums[lo]+nums[hi] == sum) {
                    res.add(Arrays.asList(nums[lo], nums[hi], nums[i]));
                    
                    while(lo<hi && nums[lo]==nums[lo+1]) lo--;
                    while(lo<hi && nums[hi]==nums[hi-1]) hi--;
                    
                    lo++; hi--;
                } else if((nums[lo] + nums[hi]) < sum) lo++;
                else lo--;
            }
        }
        return res;
    }
}
