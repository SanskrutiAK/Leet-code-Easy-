public class MostWater {
    public int maxArea(int[] height) {
        int max_area = 0;
        int left =0, right = height.length-1;
        while(right>left){
            max_area = Math.max( max_area, Math.min( height[left], height[right] )*(right-left));
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return max_area;
    }
    public static void main(String args[]){
        MostWater mw = new MostWater();
        int heights[] = {1,8,6,2,5,4,8,3,7};
        int max_area = mw.maxArea(heights);
        System.out.println("Maximumum Area is "+max_area);
    }
}
