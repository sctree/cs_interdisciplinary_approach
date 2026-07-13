public class exercise1_2_30 {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();

        System.out.println(a + " " + b + " " + c + " " + d + " " + e);

        System.out.println("Average: " + (a + b + c + d + e) / 5.0); // Java implicitly converts to double but just in case

        double max1 = Math.max(a, b);
        double max2 = Math.max(c, d);
        double max3 = Math.max(max1, max2);
        double max = Math.max(max3, e);

        double min1 = Math.min(a, b);
        double min2 = Math.min(c, d);
        double min3 = Math.min(min1, min2);
        double min = Math.min(min3, e);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
