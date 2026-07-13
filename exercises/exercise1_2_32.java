public class exercise1_2_32 {
    public static void main(String[] args) {
        // Color conversion
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        double r_div = r / 255.0;
        double g_div = g / 255.0;
        double b_div = b / 255.0;

        double w1 = Math.max(r_div, g_div);
        double w = Math.max(w1, b_div);

        double c = (w - (r_div)) / w;
        double m = (w - (g_div)) / w;
        double y = (w - (b_div)) / w;

        double k = 1 - w;

        if (r == 0 && g == 0 && b == 0) {
            c = 0.0;
            m = 0.0;
            y = 0.0;
            k = 1.0;
        }

        System.out.println(c + " " + m + " " + y + " " + k);

    }
}
