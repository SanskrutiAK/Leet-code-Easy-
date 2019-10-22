public class NumArray {
    public int[] num_array;
    public NumArray(int[] nums) {
        num_array = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for (int k = i; k<=j;k++){
            sum = sum+ num_array[k];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[]nums = {-2, 0, 3, -5, 2, -1};
        NumArray na = new NumArray(nums);
        System.out.println(na.sumRange(0,5));

    }
}
