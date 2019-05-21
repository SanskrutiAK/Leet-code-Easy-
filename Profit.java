/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.
*/


import java.util.HashMap;
import java.util.Set;

public class Profit {
public int maxProfit(int[] prices) {
    int result=0;
    int cp=0;
    int sp;
    HashMap map = new HashMap();
    for(int i=0;i<prices.length;i++){
        cp=prices[i];
        sp=cp;
        for(int j=i+1;j<prices.length;j++){
            if(prices[j]>sp){
                sp=prices[j];
            }
        }
        map.put(i,(sp-cp));
    }
    int max=0;
    for(Integer i:(Set<Integer>) map.keySet()){
        if((int)map.get(i)>max){
            max=(int)map.get(i);
        }
    }
        result=max;
    return result;
}
    public static void main(String args[]){
        Profit p= new Profit();
        int array1[]={7,1,5,3,6,4};
        System.out.println(p.maxProfit(array1));
    }
}
