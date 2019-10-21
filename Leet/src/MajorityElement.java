import java.util.HashMap;
import java.util.Set;


public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer>map = new HashMap<>();
        int majority = (nums.length)/2;
        int ans = 0;
        for(int i = 0; i< nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],(map.get(nums[i])+1));
            }
        }
        Set<Integer> elements = map.keySet();
        for(Integer element :elements){
            if(map.get(element)>majority)
                ans = element;
        }
        return ans;
    }

    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        int[] nums = new int[]{2,2,1,1,1,2,2};
        System.out.println(me.majorityElement(nums));
    }
}
