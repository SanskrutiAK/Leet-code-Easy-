import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
            return false;
        else{
            char [] stringOne = s.toCharArray();
            char [] stringTwo = t.toCharArray();
            Arrays.sort(stringOne);
            Arrays.sort(stringTwo);
            String str1 = new String(stringOne);
            String str2 = new String(stringTwo);
            if (str1.equals(str2))
                return true;
            else
                return false;
        }
    }
    public static void main(String[] args) {
        Anagram a = new Anagram();
        boolean ans =a.isAnagram("a","b");
        System.out.println(ans);
    }
}
