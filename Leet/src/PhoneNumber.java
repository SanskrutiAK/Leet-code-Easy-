import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneNumber {
    List<String> compinationsAns= new ArrayList<>();
    HashMap<String,String> phoneDirictory = new HashMap<>();

    public void backTracking(String combination,String next_Digit){

        if(next_Digit.length() == 0){
            compinationsAns.add(combination);
        }
        else {
            String candidate = phoneDirictory.get(next_Digit.substring(0,1));
            for(int i = 0 ; i<candidate.length();i++){
                backTracking(combination+candidate.substring(i,i+1),next_Digit.substring(1));
            }
        }

    }
    public List<String> letterCombinations(String digits) {
        phoneDirictory.put("2","abc");
        phoneDirictory.put("3","def");
        phoneDirictory.put("4","ghi");
        phoneDirictory.put("5","jkl");
        phoneDirictory.put("6","mno");
        phoneDirictory.put("7","pqrs");
        phoneDirictory.put("8","tuv");
        phoneDirictory.put("9","wxyz");
        if(digits.length()!=0)
        backTracking("",digits);
        return compinationsAns;
    }
    public static void main(String args[]){

        PhoneNumber pn = new PhoneNumber();
        System.out.println(pn.letterCombinations(""));
    }
}
