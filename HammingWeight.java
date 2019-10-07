import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class HammingWeight {
    public int hammingWeight(int n) {
        int numbZero =0;
//        String binaryRep = Integer.toBinaryString(n);
        String binaryRep ="00000000000000000000000000001011";
        char [] binaryRepArray = binaryRep.toCharArray();
        Arrays.sort(binaryRepArray);

        int i =0;
        while(binaryRepArray[i] == 0){
            numbZero++;
            i++;
        }
        return binaryRep.length() -numbZero ;

    }
    public static void main(String[] args) {
        HammingWeight hw = new HammingWeight();
        System.out.println(hw.hammingWeight(3));
    }
}
