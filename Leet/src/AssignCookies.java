import java.util.Arrays;
import java.util.HashSet;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int content_childern = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int currentChild = 0;

        for (int i = 0;i <s.length;i++ ){
            if(currentChild>=g.length)
                break;
            else {
                if(s[i]>=g[currentChild]) {
                    content_childern++;
                    currentChild++;
                }
            }

        }
        return content_childern;
    }
    public static void main(String[] args) {
        AssignCookies as = new AssignCookies();
        int g[] = {10,9,8,7};
        int s[] = {5,6,7,8};
        System.out.println(as.findContentChildren(g,s));

    }
}
