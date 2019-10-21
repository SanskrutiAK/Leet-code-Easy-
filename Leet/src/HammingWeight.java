import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class HammingWeight {
    public int hammingWeight(int n) {
        int numbOne =0;
        String binaryRep = Integer.toBinaryString(n);

        for(int i = 0; i< binaryRep.length();i++){
            if(binaryRep.charAt(i) == '1'){
                numbOne++;
            }
        }

        return numbOne;

    }
    public static void main(String[] args) {
        HammingWeight hw = new HammingWeight();
        System.out.println(hw.hammingWeight(-3));
    }
}
