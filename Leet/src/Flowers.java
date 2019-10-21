import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        HashSet<Integer> plantedPlaces = new HashSet<>();
        LinkedHashSet<Integer> emptySpots = new LinkedHashSet<>();
        int possibleSpots = 0;
        for(int i = 0; i<flowerbed.length;i++){
            if(flowerbed[i] == 0)
                emptySpots.add(i);
            else if(flowerbed[i] == 1)
                plantedPlaces.add(i);
        }

        Iterator itr = emptySpots.iterator();
        while (itr.hasNext()){
            int spot = (int) itr.next();
            if(plantedPlaces.contains(spot+1)||plantedPlaces.contains(spot-1)){
                continue;
            }
            else {
                possibleSpots++;
                emptySpots.remove(spot);
                plantedPlaces.add(spot);
                itr = emptySpots.iterator();
            }
        }
        return possibleSpots >=n;
    }
    public static void main(String[] args) {
        int[]array = {1,0,0,0,0,1};
        Flowers f = new Flowers();
        System.out.println(f.canPlaceFlowers(array,2));
    }
}
