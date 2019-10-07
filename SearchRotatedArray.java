import java.util.HashMap;

public class SearchRotatedArray {
    public int search(int[] nums, int target) {
       int left = 0;
       int right = nums.length-1;
       while(left<=right) {
           int mid = (left + right) / 2;
           if (target == nums[left])
               return left;
           else if (target == nums[right])
               return right;
           else if (target == nums[mid])
               return mid;
           else if (nums[left] > target) {
               if ((nums[mid] > target) && (nums[mid] < nums[left])) {
                   right = mid - 1;
               } else {
                   left = mid + 1;
               }
           } else if (nums[left] < target) {
               if((nums[mid]<target && nums[mid]>nums[left])){
                   left = mid+1;
               }
               else {
                   right = mid-1;
               }

           }
       }
       return  -1;
    }
    public static void main(String[] args) {
        SearchRotatedArray sra = new SearchRotatedArray();
        int nums[] = new int[]{4,5,6,7,0,1,2};
        System.out.println(sra.search(nums,3));
    }
}
