public class ImageRotation {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int cycles = n/2;
        for(int i = 0; i<cycles;i++){
            for(int j = i; j<n-i-1;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
    }

    static void displayMatrix(int N, int mat[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(" " + mat[i][j]);

            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {

        int N = 4;

        // Test Case 1
        int mat[][] =
                {
                        {5}
                };

        ImageRotation ir = new ImageRotation();
        ir.rotate(mat);
        ir.displayMatrix(mat.length,mat);

    }
}
