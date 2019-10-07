import java.util.HashMap;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        s =s.toUpperCase();
        HashMap<Character,Integer> map = new HashMap<>();
        int pos =1;
        int ans =0;
        for(char i= 'A'; i<='Z'; i++ ){
            map.put(i,pos);
            pos++;
        }
        for(int i =0; i<s.length();i++){
            int next = map.get(s.charAt(i));
            ans = (ans*26)+next;
        }
        return ans;
    }
    public static void main(String[] args) {
        ExcelSheetColumnNumber escn = new ExcelSheetColumnNumber();
        System.out.println(escn.titleToNumber("ZY"));

    }
}
