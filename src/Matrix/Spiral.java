
class Spiral {
   
    public static void main(String[] args) {
                int[][] matrix = {
            {1, 2, 3},
            {4,5,6,
            7,8,9}
        };

    int n= matrix.length;
        int result[][] = spiralMatrixII(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] spiralMatrixII(int n) {
         int m[][] = new int[n][n];
        int sr=0;
        int sc=0;
        int er=n-1;
        int ec=n-1;
        int i=1;

        while(i <= n*n){
            for(int col=sc;col<=ec;col++){
                m[sr][col] =i;
                i++;
            }
            sr++;

            for(int row=sr;row<=er;row++){
                m[row][ec]=i;
                i++;
            }
            ec--;

            for(int col=ec;col>=sc;col--){
                m[er][col]=i;
                i++;
            }
            er--;

            for(int row=er;row>=sr;row--){
                m[row][sc]=i;
                i++;
            }
            sc++;
        }

        return m;
    
    }
}