import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> paranthesis = new Stack<>();
        int index = 0;
        while (index<s.length()){
            if(s.charAt(index) == '{'||s.charAt(index) == '('||s.charAt(index) == '['){
                paranthesis.push(s.charAt(index));
            }
            else if(s.charAt(index) == '}'||s.charAt(index) == ')'||s.charAt(index) == ']') {
                if (paranthesis.size() > 0) {
                    Character c = paranthesis.peek();
                    if (c == '{' && (s.charAt(index) == '}'))
                        paranthesis.pop();
                    else if (c == '(' && (s.charAt(index) == ')'))
                        paranthesis.pop();
                    else if (c == '[' && (s.charAt(index) == ']'))
                        paranthesis.pop();
                    else
                        break;
                }
                else {
                    return false;
                }
            }
            else {
                break;
            }
            index++;
        }
        if(paranthesis.size() == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();
        System.out.println(vp.isValid(""));
    }
}
