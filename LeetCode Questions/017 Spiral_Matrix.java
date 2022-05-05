class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length==0)
            return res;
        int rowBegin = 0;
        int colBegin = 0;
        int rowEnd = matrix.length-1;
        int colEnd = matrix[0].length-1;
        int i,j;
        while(rowBegin<=rowEnd && colBegin<=colEnd) {
            //Traverse Right
            for(i=colBegin; i<=colEnd; i++)
                res.add(matrix[rowBegin][i]);
            rowBegin++;
            
            //Traverse Bottom
            for(i=rowBegin; i<=rowEnd; i++)
                res.add(matrix[i][colEnd]);
            colEnd--;
            
            //Traverse Left
            if(rowBegin<=rowEnd) {
                for(i=colEnd; i>=colBegin; i--)
                    res.add(matrix[rowEnd][i]);
                rowEnd--;
            }
            
            //Traverse Up
            if(colBegin<=colEnd) {
                for(i=rowEnd; i>=rowBegin; i--)
                    res.add(matrix[i][colBegin]);
                colBegin++;
            }

        }
                    return res;
    }
}
