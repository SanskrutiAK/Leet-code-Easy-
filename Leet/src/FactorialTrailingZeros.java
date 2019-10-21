public class FactorialTrailingZeros {
    public int trailingZeroes(int n) {

        int number_of_tens = n/10;
        int number_of_fives = (n/5)-number_of_tens;
        int number_of_twos = (n/2)- number_of_tens;

        int minZeros = number_of_fives<number_of_twos?number_of_fives :number_of_twos;
        return minZeros+number_of_tens;

    }
    public static void main(String[] args) {
        FactorialTrailingZeros ftz = new FactorialTrailingZeros();
        System.out.println(ftz.trailingZeroes(10));
    }
}
