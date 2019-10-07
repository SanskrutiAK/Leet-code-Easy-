public class Capital {
    public boolean detectCapitalUse(String word) {
        boolean ans = true;
        if (word.length() > 1) {
            if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
                if (word.charAt(1) >= 'A' && word.charAt(1) <= 'Z') {
                    for (int i = 2; i < word.length(); i++) {
                        if (!(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'))
                            return false;
                    }
                } else if (word.charAt(1) >= 'a' && word.charAt(1) <= 'z') {
                    for (int i = 2; i < word.length(); i++) {
                        if (!(word.charAt(i) >= 'a' && word.charAt(i) <= 'z'))
                            return false;
                    }
                }
            }
            if (word.charAt(0) >= 'a' && word.charAt(0) <= 'z') {
                for (int i = 1; i < word.length(); i++) {
                    if (!(word.charAt(i) >= 'a' && word.charAt(i) <= 'z'))
                        return false;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Capital c = new Capital();
        System.out.println(c.detectCapitalUse("ffffffffffffffffffffF"));
    }
}
