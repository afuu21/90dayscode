class Solution {
    public int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        int count=0, sum=0;
        map.put(0, 1);
        for(int a: A) {
            sum=(sum+a)%K;
            if(sum<0) sum+=K;
            count+=map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
