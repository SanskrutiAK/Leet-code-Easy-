import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class RelativeRank {
    public String[] findRelativeRanks(int[] nums) {
        int[] score = Arrays.copyOf(nums,nums.length);
        HashMap<Integer,String> ranks = new HashMap<>();
        Arrays.sort(score);
        String[] ans = new String[nums.length];
        int rank = 1;
        for(int i = score.length-1;i>=0;i--){
            if(rank == 1){
                ranks.put(score[i],"Gold Medal");
            }
            else if(rank == 2){
                ranks.put(score[i],"Silver Medal");
            }
            else if(rank == 3){
                ranks.put(score[i],"Bronze Medal");
            }
            else {
                ranks.put(score[i], Integer.toString(rank));
            }
            rank++;
        }

        for(int i = nums.length-1;i>=0;i--){
            ans[i] = ranks.get(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        RelativeRank rr = new RelativeRank();
        int[] nums = {1};
        String ans[] = rr.findRelativeRanks(nums);
        for(int i = 0; i< nums.length;i++){
            System.out.print(ans[i]+"  ");
        }
    }
}
