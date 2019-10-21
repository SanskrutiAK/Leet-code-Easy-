import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> disappered = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap();
        for(int i =0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
        }

        for(int j = 1 ; j<=nums.length; j++){
            if(!map.containsKey(j)){
                disappered.add(j);
            }
        }
        return disappered;
    }
    public static void main(String[] args) {

        int nums[] = new int[]{1,1};
        DisappearedNumbers dn = new DisappearedNumbers();
        List<Integer> answers = dn.findDisappearedNumbers(nums);

        System.out.println(answers);
    }
}
