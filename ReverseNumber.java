public class ReverseNumber {
    public int reverse(int x) {
        int val = x;
        int sol = val;
        int ans = 0;
        int flag = 0;
        boolean negativeFlag = false;
        int sum = 0, prevSum = 0;
        if (sol < 0) {
            sol = -sol;
            negativeFlag = true;
        }
        while (sol > 0) {

            prevSum = sum;
            sum = (sum * 10) + (sol % 10);
            if (((sum - (sol % 10)) / 10) != prevSum) {
                flag = 1;
                return 0;
            }

            sol = sol / 10;


        }
        if (negativeFlag)
            return -ans;
        return ans;
    }


    public static void main(String args[]) {

        ReverseNumber rn = new ReverseNumber();
        rn.reverse(123);
    }
}
