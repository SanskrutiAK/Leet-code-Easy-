public class PerfectSquares {
    public int numSquares(int n) {
        int sqrt = 2;
        int ans = 0;
        while(n>0){
            int sqr = sqrt*sqrt;
            if(sqr<=n){
                ans++;
                n=n-sqr;
            }
            if(n<sqr)
                sqrt--;
        }
        return ans;
    }
    public static void main(String[] args) {
        PerfectSquares ps = new PerfectSquares();
        ps.numSquares(12);
    }
}
