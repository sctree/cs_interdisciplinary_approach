public class exercise1_2_34 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        int min = x;
        int middle = y;
        int max = z;

        int t = -123;

        if (min > middle) {
            t = min;
            min = middle;
            middle = t;
        }
        if (middle > max) {
            t = middle;
            middle = max;
            max = t;
        }

        if (min > middle) {
            t = min;
            min = middle;
            middle = t;
        }
        if (middle > max) {
            t = middle;
            middle = max;
            max = t;
        }

        System.out.println(min + " " + middle + " " + max);


    }
}
