class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int result[] = new int[2];
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i=0; i<numbers.length; i++) {
            if(mp.containsKey(target-numbers[i])) {
                result[0]=i;
                result[1]=mp.get(target-numbers[i]);
                return result;
            }
            mp.put(numbers[i], i);
        }
        return result;
    }
}
