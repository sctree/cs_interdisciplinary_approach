public class e1_3_4 {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        if (x > 0 && x < 1 && y > 0 && y < 1) System.out.println("True");
        else System.out.println("False");
    }

    // setting x or y to 0.9999999999999999 will pass but
    // 0.99999999999999999 will fail
}
