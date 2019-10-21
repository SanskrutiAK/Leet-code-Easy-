import java.util.HashMap;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> answer = new HashMap<>();
        s = s.toLowerCase();
        for(int i =0;i<s.length();i++){
            if(answer.containsKey(s.charAt(i))){
                answer.put(s.charAt(i),answer.get(s.charAt(i))+1);
            }
            else {
                answer.put(s.charAt(i),1);
            }
        }
        for (int i = 0;i< s.length() ; i++){
            if(answer.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        FirstUniqueCharacter fuc = new FirstUniqueCharacter();
        int ans = fuc.firstUniqChar("Sanskruti");
        System.out.println(ans);
    }
}
