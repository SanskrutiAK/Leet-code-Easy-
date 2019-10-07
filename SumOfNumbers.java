public class SumOfNumbers {
    public int getSum(int a, int b) {
        int carry =0;
        while(b!=0){
            carry = a&b;
            a=a^b;
            b = carry<<1;
        }
        return a;
    }
    public static void main(String args[]){
        SumOfNumbers son = new SumOfNumbers();

        System.out.println(son.getSum(4,5));
    }
}
