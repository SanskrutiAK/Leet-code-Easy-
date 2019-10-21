public class UglyNumber {
    public int largestPrimeNumber(int number){
        int largestPrime = 1;
        while(number%2 == 0){
            largestPrime = 2;
            number/=2;
        }
        for (int i = 3; i<=Math.sqrt(number); i++){
            while (number%i == 0){
                largestPrime = i;
                number/=i;
            }
        }

        if(number>2){
            largestPrime = number;
        }
        return largestPrime;
    }
    public boolean isUgly(int num) {
        int largerstPrime = largestPrimeNumber(num);
        if(largerstPrime > 5){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        UglyNumber un = new UglyNumber();
        System.out.println(un.isUgly(9));
    }
}
