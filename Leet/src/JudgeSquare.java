import java.util.Iterator;
import java.util.TreeSet;

public class JudgeSquare {
    public boolean judgeSquareSum(int c) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = (int)Math.sqrt(c); i >=0; i--){
            set.add(i*i);
        }
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            int value = (int)itr.next();
            if(value <= c){
                int sum = c - value;
                if(set.contains(sum))
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        JudgeSquare js = new JudgeSquare();
        System.out.print(js.judgeSquareSum(0));
    }
}
