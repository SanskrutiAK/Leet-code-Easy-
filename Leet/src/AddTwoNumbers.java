public class AddTwoNumbers {
    String add(String number1, String number2){
        int n1l = number1.length();
        int n2l = number2.length();
        int carry =0;
        String Answer = "";
        int ans=0;
        while(n1l>0||n2l>0){
            if(n1l>0 && n2l>0)
                ans = carry+Character.getNumericValue(number1.charAt(n1l-1))+Character.getNumericValue(number2.charAt(n2l-1));
            if(n1l>0 &&!(n2l>0))
                ans = carry+Character.getNumericValue(number1.charAt(n1l-1));
            if(!(n1l>0) &&(n2l>0))
                ans = carry+Character.getNumericValue(number2.charAt(n2l-1));
            carry = 0;
            if(ans>9){
                carry = 1;
                ans= ans%10;
            }
         Answer = String.valueOf(ans)+Answer;
            if(n1l>0)
                n1l--;
            if (n2l>0)
            n2l--;
        }
        if (carry == 1)
            Answer = carry+Answer;
        return Answer;
    }
    public static void main(String[] args) {
        AddTwoNumbers atn = new AddTwoNumbers();
        System.out.println(atn.add("6","501"));
    }
}
