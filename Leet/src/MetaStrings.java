public class MetaStrings {
    public boolean isMetaString(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        for(int i = 0;i< str1.length();i++){

            if(str1.charAt(i)!=str2.charAt(i)){
                int index = str2.indexOf(str1.charAt(i));
                while(index < str1.length()){
                    String checkString = swap(str2,i,index);
                    if(checkString.equals(str1)){
                        return true;
                    }
                    index = str2.indexOf(str1.indexOf(str1.charAt(i),index+1));
                    if(index == -1)
                        return false;
                }
            }

        }
        return false;
    }

    public String swap(String str, int index1, int index2){
        char[] ans = str.toCharArray();
        char temp = ans[index1];
        ans[index1] = ans[index2];
        ans[index2] =  temp;
        return new String(ans);
    }
    public static void main(String[] args) {
        MetaStrings ms = new MetaStrings();
        System.out.println(ms.isMetaString("Converse","Conserve"));
    }
}
