public class exercise1_2_28 {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        boolean flag = false;

        // the operators > and < cannot be applied to Doubles
        if (Math.max(x, y) == x && Math.max(y, z) == y) {
            flag = true;
        }
        if (Math.max(z, y) == z && Math.max(y, x) == y) {
            flag = true;
        }

        System.out.println(flag);
    }
}
