class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int currSum=0;
        int l=n-k;
        int r=0;
        int maxSum=0;
        for(int i=l; i<n; i++) {
            maxSum+=cardPoints[i];
        }
        currSum=maxSum;
        for(int i=l; i<n; i++) {
            currSum = currSum-cardPoints[i]+cardPoints[r++];
            if(currSum>maxSum)
                maxSum=currSum;
        }
        return maxSum;
    }
}
