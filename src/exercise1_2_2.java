public class exercise1_2_2 {
    public static void main(String[] args) {
        double theta = Double.parseDouble(args[0]);
        double a = Math.sin(theta);
        double b = Math.cos(theta);
        double c = a*a + b*b;

        System.out.println(c);

        for (int i = 0; i < 360; ++i) {
            theta += 0.5;
            a = Math.sin(theta);
            b = Math.cos(theta);
            c = a*a + b*b;
            if (c != 1.0) {
                System.out.println("the value of c is not 1 at: " + a + ",    instead it is: " + c);
            }

        }

    }
}
