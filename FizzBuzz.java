import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> AnswerSet = new ArrayList<>();
        int commonFactor = 15;
        for(int i=0;i<n;i++){
            if((i+1)%commonFactor == 0){
                AnswerSet.add("FizzBuzz");
            }
            else if((i+1)%3 == 0){
                AnswerSet.add("Fizz");
            }
            else if((i+1)%5 == 0){
                AnswerSet.add("Buzz");
            }
            else {
                AnswerSet.add(String.valueOf(i+1));
            }
        }
        return AnswerSet;
    }
    public static void main(String args[]){
        FizzBuzz fb = new FizzBuzz();
        List answer =fb.fizzBuzz(-15);
        System.out.println(answer);
    }
}
