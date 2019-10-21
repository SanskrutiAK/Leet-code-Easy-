public class FourKeyKeyBoard {
    public int maxiumA(int n){
        if(n<=6)
            return n;
        int[] screen = new int[n];
        for(int i = 1; i<=6;i++){
            screen[i-1] = i;
        }
        for(int j = 7; j<=n;j++ ) {
            screen[j-1] = 0;
            for (int b = j - 3; b >= 1; b--) {
                int current = (j - b - 1) * screen[b - 1];
                if (current > screen[j - 1])
                    screen[j - 1] = current;
            }
        }
        return screen[n-1];
    }
    public static void main(String[] args) {
        FourKeyKeyBoard tkb = new FourKeyKeyBoard();
        System.out.println(tkb.maxiumA(16));
    }
}
