public class KthSmallestElement {
    public int kthSmallest(int[][] matrix, int k) {
        int smallestElement = 0;
        int n = matrix.length;
        int row = 0;
        int column = 0;
        if(k == n*n){
            return matrix[n-1][n-1];
        }
        if(k<=n){
            smallestElement = matrix[0][k-1];
        }
        else{
            row = k/n;
            column = k%n;
            if(column == 0){
                column = n-1;
            }

            smallestElement = matrix[row][column-1];
        }
        return smallestElement;
    }
    public static void main(String[] args) {

        KthSmallestElement ksm = new KthSmallestElement();
        int [][] matrix = new int[][]{{1, 5, 9},{10, 11, 13},{12, 13, 15}};
        System.out.println(ksm.kthSmallest(matrix,7));

    }
}
