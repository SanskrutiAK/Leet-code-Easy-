public class ReverseBits {
    public int reverseBits(int n) {

        String givenInteger = Integer.toBinaryString(n);

        int appendZeros = 32-givenInteger.length();

        String prefix ="";

        for(int i =0; i< appendZeros; i++){
            prefix+="0";
        }

        givenInteger =prefix+givenInteger;

        StringBuilder reverseInteger = new StringBuilder(givenInteger);

        String reverseIntegerAns = reverseInteger.reverse().toString();
        System.out.println(reverseIntegerAns);
        return Integer.parseInt(reverseIntegerAns,2);
    }

    public static void main(String[] args) {
        ReverseBits rb = new ReverseBits();
        //System.out.println(rb.reverseBits(3));
        System.out.println(Integer.toBinaryString(-3));
    }
}
