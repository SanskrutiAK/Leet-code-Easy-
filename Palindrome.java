import java.util.HashMap;

public class Palindrome {
    public String longestPalindrome(String str) {
        int len = str.length();
        boolean table[][] = new boolean[len][len];
        int start = 0;
        int maxLength = 1;

        if(str.length()<0)
            return str;
        //All the characters are palindromes themselves

        for(int i = 0;i<len;i++)
            table[i][i] = true;

        for(int j = 0;j<len-2+1;j++){
            if(str.charAt(j)==str.charAt(j+1)) {
                table[j][j + 1] = true;
                if (maxLength < 2) {
                    start = j;
                    maxLength = 2;
                }
            }
        }

        for(int k = 3; k<=len;k++){
            for(int l = 0; l<len-k+1; l++){
                //starting position
                int endPos = l+k-1;
                if(str.charAt(l)==str.charAt(endPos) && table[l+1][endPos-1]==true){
                    table[l][endPos] = true;

                    if(maxLength<k){
                        start = l;
                        maxLength = k;
                    }
                }
            }
        }
        return str.substring(start,start+maxLength);
    }
    public static void main(String args[]){
        Palindrome palin = new Palindrome();

        String ans = palin.longestPalindrome("a");
        System.out.println("The Longest palindrome is "+ans);
    }
}
