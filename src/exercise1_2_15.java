public class exercise1_2_15 {
    public static void main(String[] args) {
        // this program tests if the three numbers could be the length of a triangle
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean flag = true;

        if (a >= b + c) {
            flag = false;
        }
        if (b >= a + c) {
            flag = false;
        }
        if (c >= a + b) {
            flag = false;
        }

        System.out.println(flag);
    }

}
