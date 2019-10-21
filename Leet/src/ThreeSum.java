import java.lang.reflect.Array;
import java.util.*;

public class ThreeSum {
    public List<List<Integer>>threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        HashSet<String> unique = new HashSet<>();
        for(int i = 0 ; i<nums.length; i++ ){
            int left = i+1;
            int right =nums.length-1;

            while (left<right){
                int check = nums[i]+nums[left]+nums[right];
                List<Integer> set = new ArrayList<>();
                String str ="";
                if( check == 0){
                    str = str+(Integer.toString(nums[i])+(Integer.toString(nums[right]))+(Integer.toString(nums[left])));
                    if(!unique.contains(str)) {
                        unique.add(str);
                        set.add(nums[i]);
                        set.add(nums[left]);
                        set.add(nums[right]);
                        answer.add(set);
                    }
                    left++;
                    right --;
                }
                else if(check < 0){
                    left++;
                }
                else if(check > 0){
                    right --;
                }

            }

        }
      return answer;

    }
    public  static  void main(String args[]){
        ThreeSum ts = new ThreeSum();
        int nums[] = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(ts.threeSum(nums));

    }
}
