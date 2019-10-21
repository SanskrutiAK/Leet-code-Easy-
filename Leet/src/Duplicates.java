import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Duplicates {
    public boolean containsDuplicate(int[] nums) {
        boolean contains = false ;
//        HashMap<Integer,Integer>ArrayCount = new HashMap<>();
//        for(int i =0;i<nums.length;i++){
//            if(ArrayCount.containsKey(nums[i]))
//                ArrayCount.put(nums[i],ArrayCount.get(nums[i])+1);
//            else
//                ArrayCount.put(nums[i],1);
//        }
//
//        for (int i =0;i< nums.length;i++){
//            if(ArrayCount.containsKey(nums[i])){
//                if(ArrayCount.get(nums[i])>1)
//                    contains = true;
//            }
//        }
        Arrays.sort(nums);
        for(int i =1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                return true;
        }
        return contains;
    }
    public static void main(String args[]){
        Duplicates d = new Duplicates();
        int [] nums = new int[]{1,3,3};
        System.out.println(d.containsDuplicate(nums));
    }
}
