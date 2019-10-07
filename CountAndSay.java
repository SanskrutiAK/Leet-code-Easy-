public class CountAndSay {
    public String countAndSay(int n) {

        int i = 0;
        char say = '1';
        //The initial String
        StringBuilder sb = new StringBuilder("1");
        if (n > 1) {
            while (n >=0) {
                char csArray[] = sb.toString().toCharArray();
                sb.setLength(0);
                int count = 0;
                count++;

                for (i = 1; i < csArray.length; i++) {
                    say = csArray[i-1];
                    while (i <=csArray.length - 1 && (csArray[i] == csArray[i - 1])) {
                        count++;
                        i++;
                    }
                    sb.append(count).append(Character.toString(say));
                }

                n--;
            }
        }
            return sb.toString();
    }
    public static void main(String[] args) {
        CountAndSay cs = new CountAndSay();
        System.out.println(cs.countAndSay(4));
    }
}
