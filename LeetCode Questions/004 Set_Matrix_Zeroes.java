class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int c=0, i, j;
        ArrayList<Integer> x = new ArrayList<Integer>();
        
        for(i=0; i<m; i++) {
            for(j=0; j<n; j++) {
                if(matrix[i][j] == 0) {
                    x.add(i);
                    x.add(j);
                    c+=2;
                }
            }
        }
        int k=0, f, g;
        while(k<c) {
            f=x.get(k++);
            g=x.get(k++);
            
            for(int a=0; a<n; a++) {
                matrix[f][a]=0;
            }
            
            
            for(int a=0; a<m; a++) {
                matrix[a][g]=0;
            }
        }
    }
}
