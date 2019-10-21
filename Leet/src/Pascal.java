import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public List<Integer> getRow(int rowIndex){
        List solution = new ArrayList();
        int ans = (int) Math.round(Math.pow(11, rowIndex));
        while (ans != 0) {
            solution.add(ans%10);
            ans= ans/10;
        }
        return solution;
    }
    public static void main(String args[]) {

        Pascal p = new Pascal();
        List ans =p.getRow(2);
        System.out.println(ans);

    }
}
