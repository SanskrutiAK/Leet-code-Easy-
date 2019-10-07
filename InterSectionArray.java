import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InterSectionArray {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> nums1Map = new HashMap<>();
        HashMap<Integer,Integer> nums2Map = new HashMap<>();
        HashMap<Integer,Integer> answerMap = new HashMap<>();

        List<Integer> answer = new ArrayList<>();
        int min[] = nums1.length<nums2.length? nums1 : nums2;

        for(int i =0;i<nums1.length;i++){
            if(nums1Map.containsKey(nums1[i]))
                nums1Map.put(nums1[i],(nums1Map.get(nums1[i]))+1);
            else
                nums1Map.put(nums1[i],1);
        }

        for(int i =0;i<nums2.length;i++){
            if(nums2Map.containsKey(nums2[i]))
                nums2Map.put(nums2[i],(nums2Map.get(nums2[i]))+1);
            else
                nums2Map.put(nums2[i],1);
        }

        for(int i = 0; i<min.length ;i++){
            if(nums1Map.containsKey(min[i])&&nums2Map.containsKey(min[i])){
                if(nums1Map.get(min[i])>0 && nums2Map.get(min[i])>0){
                    answer.add(min[i]);
                    nums1Map.put(min[i],nums1Map.get(min[i])-1);
                    nums2Map.put(min[i],nums2Map.get(min[i])-1);
                }
            }

        }
        int finalAns[] = new int[answer.size()];
        for(int i =0; i< answer.size();i++){
            finalAns[i] = answer.get(i);
        }
        return finalAns;
    }

    public static void main(String[] args) {
        InterSectionArray isa = new InterSectionArray();
        int[]nums1 = new int[]{4,9,5};
        int[]nums2 = new int[]{2};
        int answer[] = isa.intersect(nums1,nums2);
        for(int i =0;i<answer.length;i++)
        System.out.println(answer[i]);
    }
}
