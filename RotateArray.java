import java.util.HashMap;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(i, nums[i]);
        }
        for(int i = 0 ;i< nums.length ;i++){
            int pos = (i+k)%(nums.length);
            nums[pos] = map.get(i);
        }
    }

    public static void main(String[] args) {
        int nums[] = new int[]{-1,-100,3,99};
        RotateArray ra = new RotateArray();
        ra.rotate(nums,4);
        for(int i =0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
