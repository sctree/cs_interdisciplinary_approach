import java.util.Hashtable;

import java.util.Dictionary;

public class exercise1_2_29 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        Dictionary<Integer, String> DaysOfWeek = new Hashtable<>();

        DaysOfWeek.put(1, "Monday");
        DaysOfWeek.put(2, "Tuesday");
        DaysOfWeek.put(3, "Wednesday");
        DaysOfWeek.put(4, "Thursday");
        DaysOfWeek.put(5, "Friday");
        DaysOfWeek.put(6, "Saturday");
        DaysOfWeek.put(7, "Sunday");

        System.out.println(DaysOfWeek.get(d0));
    }
}
