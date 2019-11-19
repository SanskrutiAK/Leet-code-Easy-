import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class keyBoardRow {
    public String[] findWords(String[] words) {
        List<String> answer = new ArrayList<>();
        HashSet<Character> row_1 = new HashSet<>();
        HashSet<Character> row_2 = new HashSet<>();
        HashSet<Character> row_3 = new HashSet<>();

        row_1.add('q');
        row_1.add('w');
        row_1.add('e');
        row_1.add('r');
        row_1.add('t');
        row_1.add('y');
        row_1.add('u');
        row_1.add('i');
        row_1.add('o');
        row_1.add('p');

        row_2.add('a');
        row_2.add('s');
        row_2.add('d');
        row_2.add('f');
        row_2.add('g');
        row_2.add('h');
        row_2.add('j');
        row_2.add('k');
        row_2.add('l');

        row_3.add('z');
        row_3.add('x');
        row_3.add('c');
        row_3.add('v');
        row_3.add('b');
        row_3.add('n');
        row_3.add('m');

        int i  = 0;
        for(String str: words){
            HashSet<Character> currentSet;
            String s = str.toLowerCase();
            char ch = s.charAt(0);
            if(row_1.contains(ch))
                currentSet = row_1;
            else if(row_2.contains(ch))
                currentSet = row_2;
            else
                currentSet = row_3;
            for(i = 1; i<str.length();i++){
                if(!currentSet.contains(s.charAt(i)))
                    break;
            }
            if(i==str.length())
                answer.add(str);
        }
        return answer.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        keyBoardRow kbr = new keyBoardRow();
        String[] input = {"asdfghjkl","qwertyuiop","zxcvbnm"};
        String[] ans = (kbr.findWords(input));
        for(String str: ans)
            System.out.println(str);
    }
}
