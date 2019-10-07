import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HayStack {
    public int strStr(String haystack, String needle) {
    int position =-1;
    if(needle.length()==0){
        return 0;
    }
    if(needle.length()>haystack.length())
        return -1;
    if(haystack.length()>0) {
        HashMap<Character, List<Integer>> hayStackHM = new HashMap<>();
        for (int i = 0; i < haystack.length(); i++) {
            hayStackHM.put(haystack.charAt(i), new ArrayList<>());
        }

        for (int i = 0; i < haystack.length(); i++) {
            hayStackHM.get(haystack.charAt(i)).add(i);
        }
        if (hayStackHM.containsKey(needle.charAt(0))) {
            List probablePositions = hayStackHM.get(needle.charAt(0));
            for (int i = 0; i < probablePositions.size(); i++) {
                int post = (int) probablePositions.get(i);
                int needleSize = needle.length();
                int np = 0;
                while (needleSize > 0) {
                    if (needle.charAt(np) == haystack.charAt(post)) {
                        needleSize--;
                        np++;
                        post++;
                        if(post>=haystack.length())
                            break;
                    } else {
                        break;
                    }
                }
                if (needleSize == 0) {
                    return (int) probablePositions.get(i);
                }
            }
        }
    }
    return position;
    }
    public static void main(String[] args) {
        HayStack hs = new HayStack();
        System.out.println(hs.strStr("mississippi", "issipi"));


    }
}
