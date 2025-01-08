class SetZero {
    public void setMatrixZeroes(int[][] matrix) {
        int n=matrix.length; int m= matrix[0].length;
        boolean row[] = new boolean[n];
         boolean col[] = new boolean[m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i] = true;
                    col[j]=true;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i] || col[j]){
                    matrix[i][j] =0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4,5,6,
            7,8,9}
        };

        int n=3;
        int m=3;

      
        new SetZero().setMatrixZeroes(matrix);

        for(int i = 0 ; i < m ; ++i) {
            for(int j = 0 ; j < n ; ++j) {
                System.out.print(matrix[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}