import java.util.HashMap;

public class DayOfWeek {
    public static HashMap<Integer,String> weekdayMap = new HashMap<>();
    public String dayOfTheWeek(int day, int month, int year) {

        int t[] = {0,3,2,5,0,3,5,1,4,6,2,4};

        if(month<3)
            year-=1;
        int calculated = (year)+(year/4)-(year/100)+(year/400)+t[month-1]+day;
        int dow = (calculated)%7;
        return weekdayMap.get(dow);

    }
    public static void main(String[] args) {
        weekdayMap.put(7,"Sunday");
        weekdayMap.put(0,"Sunday");
        weekdayMap.put(1,"Monday");
        weekdayMap.put(2,"Tuesday");
        weekdayMap.put(3,"Wednesday");
        weekdayMap.put(4,"Thursday");
        weekdayMap.put(5,"Friday");
        weekdayMap.put(6,"Saturday");

        DayOfWeek dow = new DayOfWeek();
        System.out.println(dow.dayOfTheWeek(29,2,2016));
    }
}
