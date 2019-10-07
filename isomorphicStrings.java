import java.util.HashMap;

public class isomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        boolean ans = false;
        HashMap<Character,Boolean> map = new HashMap<>();
        if(s.equals(t))
            return true;
        if(s.length()!=t.length()){
            return false;
        }
        else{

            String testString = s;
            int i = 0;
            while(i<s.length()){
                if(!map.containsKey(t.charAt(i))) {
                    testString = s.replaceAll(Character.toString(s.charAt(i)), Character.toString(t.charAt(i)));
                    map.put(t.charAt(i), true);
                }
                if(testString.equals(t))
                    return true;
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        isomorphicStrings is = new isomorphicStrings();
        System.out.println(is.isIsomorphic("abab","baba"));
    }
}
