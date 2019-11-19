import java.util.HashMap;

public class TestHashMap {
    public static HashMap<coardinates,String> map = new HashMap<>();
    public final static class coardinates{
         final int x;
         final int y;
         public coardinates(int x, int y){
             this.x = x;
             this.y = y;
         }
    }

    public static void main(String[] args) {
        coardinates c1 = new coardinates(1,2);
        coardinates c2 = new coardinates(1,2);
        map.put(c1,"horse");
        System.out.println(c1.equals(c2));
    }
}
