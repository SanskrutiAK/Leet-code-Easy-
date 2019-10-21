public class TwoKeysKeyBoard {
    public int minSteps(int n) {
        int reqChars = n;
        int min_steps = 0;
        int buffer = 1;
        int stepper = 1;
        while (buffer < n){
            if(n%buffer == 0){
                min_steps++;
                stepper = buffer;
            }
            buffer+=stepper;
            min_steps++;
        }
        return min_steps;
    }
    public static void main(String[] args) {
        TwoKeysKeyBoard tkb = new TwoKeysKeyBoard();
        System.out.println(tkb.minSteps(1000));
    }
}
