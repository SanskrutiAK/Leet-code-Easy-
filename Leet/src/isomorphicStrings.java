import java.util.HashMap;

public class isomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Boolean> map = new HashMap<>();
        boolean [] visited = new boolean[s.length()];
        if(s.equals(t))
            return true;
        if(s.length()!=t.length()){
            return false;
        }
        else{

            char[] sarray = s.toCharArray();
            char[] tarray = t.toCharArray();
            int index = 0;
            for(int i = 0;i< s.length();i++) {
                if (sarray[i] != tarray[i]) {
                    char characterToReplace = sarray[i];
                    index = i;
                    while (index < sarray.length) {
                        if (!visited[index]) {
                           sarray[i] = tarray[i];
                            visited[index] = true;
                            index++;
                        }
                    }

                    if ((sarray.toString()).equals(tarray.toString()))
                        return true;
                }
            }

        }
        return false;
    }
    public static void main(String[] args) {

        isomorphicStrings is = new isomorphicStrings();
        System.out.println(is.isIsomorphic("abab","baba"));
    }
}
