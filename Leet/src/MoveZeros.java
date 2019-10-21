import java.util.Arrays;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
       int zeroPos = 0;
       int zeroCount = 0;
       int traversingCount = 0;
       while(traversingCount<nums.length){
           if(!(nums[zeroPos] == 0)){
               zeroPos++;
               traversingCount++;
           }
           else{
               zeroCount++;
               traversingCount++;
               for(int i = zeroPos; i< nums.length-1;i++){
                   nums[i] = nums[i+1];
               }
           }
       }
       int j = nums.length -1;
       while (zeroCount>0){
           nums[j] = 0;
           j--;
           zeroCount --;
       }
    }
    public static void main(String[] args) {
        int[]nums = new int[]{3,0,0,0,12};
        MoveZeros mx = new MoveZeros();
        mx.moveZeroes(nums);
        for (int i =0;i<nums.length;i++)
        System.out.println(nums[i]);
    }
}
