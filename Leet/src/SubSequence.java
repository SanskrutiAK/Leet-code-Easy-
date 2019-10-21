public class SubSequence {
    public boolean isSubsequence(String t, String s) {
        int index_check;
        char[]array = s.toCharArray();
        if(t.length()==0){
            return true;
        }
        if(t.length()>s.length()){
            return false;
        }
        if(s.indexOf(t.charAt(0))!=-1){
            index_check = s.indexOf(t.charAt(0));
        }
        else
            return false;

        for(int i = 1; i<t.length();i++){
            int check = t.charAt(i);
            if(s.indexOf(check,index_check+1)!=-1){
                if(index_check<s.indexOf(check,index_check+1)){
                    index_check = s.indexOf(check,index_check+1);
                }
                else
                    return false;
            }
            else
                return false;

        }
        return true;
    }
    public static void main(String[] args) {
        SubSequence ss = new SubSequence();
        System.out.println(ss.isSubsequence("abc","abcdefghijk"));
    }
}
