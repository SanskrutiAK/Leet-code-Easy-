/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
*/
import java.util.HashMap;
import java.util.Set;

public class SingleNumber {
    private int single(int array[]){
        int result=array[0];
        HashMap map = new HashMap();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],(int)map.get(array[i])+1);
            }
            else{
                map.put(array[i],1);
            }

        }
        for(int i:(Set<Integer>)map.keySet()){

            if((int)map.get(i)==1){
              result=i;
               break;
            }
        }
        return result;

    }
    public static void main(String args[]){
        int array[]={1,2,2,1,3,3,4,5,5};
        SingleNumber s =new SingleNumber();
        System.out.println(s.single(array));
    }
}
