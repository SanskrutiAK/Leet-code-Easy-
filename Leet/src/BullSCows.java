import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class BullSCows {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;

        int[] map1 = new int[10];
        int[] map2 = new int[10];
        for(int i = 0;i< guess.length();i++){
            map1[Character.getNumericValue(secret.charAt(i))]++;
            map2[Character.getNumericValue(guess.charAt(i))]++;
        }
        for(int i = 0 ;i< map1.length;i++){
            cows+= Math.min(map1[i],map2[i]);
        }
        for (int i =0;i<guess.length();i++){
            if(guess.charAt(i)==secret.charAt(i)) {
                bulls++;
            }
        }
        cows= cows-bulls;
        return bulls+"A"+cows+"B";
    }
    public static void main(String[] args) {
        BullSCows bc = new BullSCows();
        System.out.println(bc.getHint("1122","1222"));
    }
}
