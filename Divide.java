public class Divide {
    public int divide(int dividend, int divisor) {
        int signDivident = 1;
        int signDivisor = 1;
        int quotient = 0;

        if(dividend == Integer.MIN_VALUE){
            dividend = Integer.MAX_VALUE;
            signDivident =-1;
        }



        if(dividend < 0){
            signDivident = -1;
            dividend = dividend*(-1);
        }

        if(divisor < 0){
            signDivisor = -1;
            divisor = divisor*-1;
        }

        if(divisor > dividend)
            return 0;

        if(divisor == 1)
            return dividend*signDivident*signDivisor;

        int remainder = dividend;

        if(remainder == divisor){
            return 1*signDivident*signDivisor;
        }

        while(remainder >=divisor){
            remainder = remainder-divisor;
            quotient++;
        }

        return quotient*signDivident*signDivisor;
    }
    public static void main(String[] args) {
        Divide d = new Divide();
        System.out.println(d.divide(-2147483648, -1));

    }
}
