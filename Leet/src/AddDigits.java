public class AddDigits {
    public int addDigits(int num) {
        int answer = num;
        int sum = 0;
        int number_of_digits = Integer.MAX_VALUE;
        /*number_of_digits = 0
        loop every digit in ans as add it to sum;
        check if number_of_digits = 1
        if so,
        return ans;
        * */
        while (number_of_digits > 1) {
            number_of_digits = 0;
            while (answer > 0) {
                sum = sum + (answer % 10);
                answer = answer / 10;
                number_of_digits++;
            }

            answer = sum;
            sum = 0;
        }

        if(number_of_digits == 1)
            return answer;
        else
            return 0;

    }
    public static void main(String[] args) {
        AddDigits ad = new AddDigits();
        System.out.println(ad.addDigits(11111198));

    }
}
