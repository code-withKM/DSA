
class Rotate90 {
   
    public static void main(String[] args) {
                int[][] matrix = {
            {1, 2, 3},
            {4,5,6},
            {7,8,9}
        };

    int n= matrix.length;
        //  rotate90brute(matrix,n);

        rotate90better(matrix,n);

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotate90brute(int[][] matrix,int n) {
         int m[][] = new int[n][n];
      
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m[j][n-i-1] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = m[i][j];
            }
        }
        // return m;
    }

    private static void rotate90better(int[][] matrix, int n) {
        //  transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int t= matrix[i][j];
                matrix[i][j] = matrix[j][i];
                 matrix[j][i] = t; 
            }
        }

        // reverse

        for(int i=0;i<n;i++){
            int start=0;
            int end=n-1;

            while(start<end){
                int t= matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] =t;
                start++;
                end--;
            }

        }
    }
}