public class e1_3_2 {
    public static void main(String[] args) {

        // a better (allegedly) quadratic formula

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double d = b*b - 4 * a * c;
        if (d < 0) {
            System.out.println("Negative discriminant. No real roots");
        }
        else {
            if (a == 0) {
                double r = -c / b;
                System.out.println("R1: " + r);
            }
            else {
                double r1 = (-b + Math.sqrt(d)) / (2 * a);
                double r2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("R1: " + r1);
                System.out.println("R2: " + r2);
            }
        }


    }

}
