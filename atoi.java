public class atoi {
    public int myAtoi(String str) {

        int signFlag = 1;
        String test ="";
        boolean numberStart = false;
        boolean signSet = false;


       str = str.trim();

        if(str.equals(""))
            return 0;

       for (int i = 0 ; i< str.length() ; i++){

           if(str.charAt(i) == '+') {
               if(signSet||numberStart){
                   if(numberStart){
                       return signFlag*Integer.parseInt(test);
                   }
                   else
                       return 0;
               }
               else {
                   signSet = true;
                   signFlag = 1;
               }
           }
           else if(str.charAt(i) == '-') {
               if(signSet||numberStart){
                   if(numberStart){
                       return signFlag*Integer.parseInt(test);
                   }
                   else
                       return 0;
               }
               else {
                   signSet = true;
                   signFlag = -1;
               }
           }
           else if( str.charAt(i) >='0' && str.charAt(i)<='9' ){
               numberStart = true;
               test+=str.charAt(i);
               try{
                   Integer.parseInt(test);
               }
               catch (Exception e){
                   if(signFlag == -1)
                       return Integer.MIN_VALUE;
                   else
                       return Integer.MAX_VALUE;
               }
           }
           else if(numberStart)
               return signFlag*Integer.parseInt(test);
           else if(str.charAt(i) <'0' || str.charAt(i)>'9' ) {
               if(numberStart){
                   return signFlag*Integer.parseInt(test);
               }
               return 0;
           }
        }
       if(test == "")
           return 0;
       return signFlag*Integer.parseInt(test);
    }
    public static void main(String args[]){
        atoi a = new atoi();
        int ans = a.myAtoi("0-2");
        System.out.println(ans);
    }
}
