public class exercise1_2_14 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        //this is probably the part that's giving me a NullPointerException error
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        int c = a % b;
        int d = b % a;

        if (c == 0 || d == 0) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
}
