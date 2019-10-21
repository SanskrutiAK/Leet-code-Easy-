public class PowerTwo {

    public boolean isPowerOfTwo(int n) {
        if(n == 1)
            return true;
        while(n>1){
            if(n%2 == 0 && n>=2 ) {
                n = n / 2;
                if (n == 1) {
                    return true;
                }
            }
            else{
                break;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        PowerTwo pt = new PowerTwo();
        System.out.println(pt.isPowerOfTwo(218));
    }
}
