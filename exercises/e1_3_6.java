public class e1_3_6 {
    public static void main(String[] args) {
        double T = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);

        boolean badInput = false;

        if (T > 50 || T < -50) {
            System.out.println("Invalid T value");
            badInput = true;
        }
        if (v > 120 || v < 3) {
            System.out.println("Invalid v value");
            badInput = true;
        }

        if (badInput) {
            System.out.println("Cannot be computed");
        }
        else { double w = 35.74 + 0.6215 * T + (0.4275 * T - 35.75) * Math.pow(v, 0.16); System.out.println(w);}
    }
}
