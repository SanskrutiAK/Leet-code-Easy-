import java.util.HashMap;

public class FirstLastPosition {
    public int[] searchRange(int[] nums, int target) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i],i);
        }

        int ans[] = new int[2];
        ans[0] = map.get(target);

        int j = target;
        while(j<nums.length){
            if(nums[j]==target)
                j++;
            else
                break;;
        }
        ans[1] = j-1;
        return ans;
    }
    public static void main(String[] args) {

    }
}
