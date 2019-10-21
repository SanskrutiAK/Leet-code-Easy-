import java.util.*;

public class LRUCache {

    public static Deque<Integer> cache;
    public static HashMap<Integer,Integer> map;
    static int cacheSize = 0;
    LRUCache(int size){
        cache = new LinkedList<>();
        map = new HashMap<>();
        cacheSize = size;
    }

    public void put(int key, int value) {
        if(!map.containsKey(key)){
            if(cache.size() == cacheSize){
                int last = cache.removeLast();
                map.remove(last);
            }
        }
        else{
            Iterator itr = cache.iterator();
            int index = 0, i = 0;
            while (itr.hasNext()){
                if(itr.next() == (Integer)key){
                    cache.remove(key);
                    map.remove(key);
                    break;
                }
            }
        }
        cache.push(key);
        map.put(key,value);
    }
    public int get(int key) {
        if(! map.containsKey(key))
            return -1;

        Iterator itr = cache.iterator();
        int index = 0, i = 0;
        while (itr.hasNext()){
            if(itr.next() == (Integer)key){
                cache.remove(key);
                break;
            }
        }
        cache.push(key);
        return map.get(key);
    }
    public void display()
    {
        Iterator<Integer> itr = cache.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
    public static void main(String[] args) {
        LRUCache ca = new LRUCache(2);
        ca.put(1,1);
        ca.put(2,2);
        int ans = ca.get(1);
        ca.put(3,3);
        ans = ca.get(2);
        System.out.println(ans);
    }
}
