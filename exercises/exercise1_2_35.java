public class exercise1_2_35 {
    public static void main(String[] args) {
        // Dragon curves

        // Order 0
        String a = "F";

        // Order 1
        String b = a + "L" + a;

        // Order 2
        String c = b + "L" + "FRF";

        // Order 3
        String d = c + "L" + "FLFRFRF";

        // Order 4
        String e = d + "L" + "FLFLFRFRFLFLFRF";

        // Order 5
        String f = e + "L" + "FLFRFRFLFLFRFRFRFLFLFRFRFLFRFRF";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);


    }
}
