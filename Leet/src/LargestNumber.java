import java.util.Iterator;
import java.util.TreeSet;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        /*
        * 9 buckets -> each bucket has numbers belonging to that particular bucket
        * In each bucket arrange the numbers in Descending Order
        * Create an empty string and upend all the values from the bucket starting in Decending Order
        * */
        TreeSet<Integer> bucket0 = new TreeSet<>();
        TreeSet<Integer> bucket1 = new TreeSet<>();
        TreeSet<Integer> bucket2 = new TreeSet<>();
        TreeSet<Integer> bucket3 = new TreeSet<>();
        TreeSet<Integer> bucket4 = new TreeSet<>();
        TreeSet<Integer> bucket5 = new TreeSet<>();
        TreeSet<Integer> bucket6 = new TreeSet<>();
        TreeSet<Integer> bucket7 = new TreeSet<>();
        TreeSet<Integer> bucket8 = new TreeSet<>();
        TreeSet<Integer> bucket9 = new TreeSet<>();

        for(int i = 0;i<nums.length;i++){
            int digits = (int)Math.log10(nums[i]);
            int first_digit = (int)(nums[i]/(int)Math.pow(10,digits));
            switch (first_digit){
                case 0: bucket0.add(nums[i]); break;
                case 1: bucket1.add(nums[i]); break;
                case 2: bucket2.add(nums[i]); break;
                case 3: bucket3.add(nums[i]); break;
                case 4: bucket4.add(nums[i]); break;
                case 5: bucket5.add(nums[i]); break;
                case 6: bucket6.add(nums[i]); break;
                case 7: bucket7.add(nums[i]); break;
                case 8: bucket8.add(nums[i]); break;
                case 9: bucket9.add(nums[i]); break;
            }
        }
        String bucket0_string ="";
        String bucket1_string ="";
        String bucket2_string ="";
        String bucket3_string ="";
        String bucket4_string ="";
        String bucket5_string ="";
        String bucket6_string ="";
        String bucket7_string ="";
        String bucket8_string ="";
        String bucket9_string ="";

        Iterator itr0 = bucket0.iterator();
        while (itr0.hasNext()){
            bucket0_string = itr0.next().toString()+bucket0_string;
        }
        Iterator itr1 = bucket1.iterator();
        while (itr1.hasNext()){
            bucket1_string = itr1.next().toString()+bucket1_string;
        }
        Iterator itr2 = bucket2.iterator();
        while (itr2.hasNext()){
            bucket2_string = itr2.next().toString()+bucket2_string;
        }
        Iterator itr3 = bucket3.iterator();
        while (itr3.hasNext()){
            bucket3_string = itr3.next().toString()+bucket3_string;
        }
        Iterator itr4 = bucket4.iterator();
        while (itr4.hasNext()){
            bucket4_string = itr4.next().toString()+bucket4_string;
        }
        Iterator itr5 = bucket5.iterator();
        while (itr5.hasNext()){
            bucket5_string = itr5.next().toString()+bucket5_string;
        }
        Iterator itr6 = bucket6.iterator();
        while (itr6.hasNext()){
            bucket6_string = itr6.next().toString()+bucket6_string;
        }
        Iterator itr7 = bucket7.iterator();
        while (itr7.hasNext()){
            bucket7_string = itr7.next().toString()+bucket7_string;
        }
        Iterator itr8 = bucket8.iterator();
        while (itr8.hasNext()){
            bucket8_string = itr8.next().toString()+bucket8_string;
        }
        Iterator itr9 = bucket9.iterator();
        while (itr9.hasNext()){
            bucket9_string = itr9.next().toString()+bucket9_string;
        }

        return bucket9_string+bucket8_string+bucket7_string+bucket6_string+bucket5_string+bucket4_string+bucket3_string+bucket2_string+bucket1_string+bucket0_string;
    }

    public static void main(String[] args) {
        int[]nums = {3,30,34,5,9};
        LargestNumber ln = new LargestNumber();
        System.out.println(ln.largestNumber(nums));
    }
}
