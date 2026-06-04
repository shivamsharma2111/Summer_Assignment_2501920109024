class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        if (n * m != r * c) {
                  return mat;
        }
        int [] temp=new int[n*m];
        int k=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                temp[k]=mat[i][j];
                k++;
            }
        }
        int [] []mat2=new int[r][c];
        int a=0;
        for(int x=0; x<r; x++){
            for(int y=0; y<c; y++){
                mat2[x][y]=temp[a];
                a++;
            }
        }
        return mat2;
    }
}