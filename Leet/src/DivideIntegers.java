public class DivideIntegers {
    public int divide(int dividend, int divisor) {
        int quotient = 0;
        int signFlag = 1;
        int prev =0;
        if(divisor ==1){
            return dividend;
        }
        if(dividend<0){
            if(dividend == Integer.MIN_VALUE &&divisor == -1){

                dividend = Integer.MAX_VALUE;
            }
            dividend = dividend*-1;
            signFlag = signFlag*-1;
        }
        if(divisor<0){
            divisor = divisor*-1;
            signFlag = signFlag*-1;
        }
        if(dividend<divisor){
            return 0;
        }
        while(dividend>=divisor){
            quotient++;
            prev = dividend;
            dividend-=divisor;
            if((prev - dividend)!=divisor){
                return Integer.MAX_VALUE;
            }
        }
        return quotient*signFlag;
    }
    public static void main(String[] args) {
        DivideIntegers di = new DivideIntegers();
        System.out.println(di.divide(-2147483648 ,1));
    }
}
