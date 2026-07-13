public class exercise1_2_19 {
    public static void main(String[] args) {
        // 1.2.19
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        double r = Math.random();

        int value = (int) (r * (b - a));

        int c = a + value;


        System.out.println(c);

    }
}
