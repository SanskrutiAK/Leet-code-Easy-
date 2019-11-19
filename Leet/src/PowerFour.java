public class PowerFour {

    public boolean isPowerOfFour(int num) {


        if(num <= 0)
            return false;

        while(num>1){
            if(num%4 != 0)
                return false;
            num=num/4;
        }

        return true;
    }
    public static void main(String[] args) {
        PowerFour pf = new PowerFour();
        System.out.println(pf.isPowerOfFour(-2147483648));

    }

}
