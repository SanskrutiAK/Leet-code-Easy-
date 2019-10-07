import java.lang.reflect.Array;
import java.util.*;

public class ThreeSum {
    public List<List<Integer>>threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> answer = new ArrayList<>();
      for( int i = 0; i<nums.length;i++){
          if(nums[i]==nums[i-1]&& i>0)
              continue;
          for(int j = i+1; j< nums.length; j++){
              for(int k =j+1;k<nums.length;k++){
                if(nums[i]+nums[j]+nums[k]==0){
                   List newList = new ArrayList();
                   newList.add(nums[i]);
                   newList.add(nums[j]);
                   newList.add(nums[k]);
                   answer.add(newList);
               }
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
