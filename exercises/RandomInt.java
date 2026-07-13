public class RandomInt {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double r = Math.random();
        int value = (int) (r * n);
        System.out.println(value);

        byte a = 123;
        byte b = 54;
        byte c = (byte)(a + b);

        System.out.println(c);

        int d = -2147483648;
        System.out.println(Math.abs(d));

        //int e = 1 / 0;
        int f = 1 % 0;
        //System.out.println(e);
        System.out.println(f);
    }
}

// the compiler didn't give the message "possible loss of precision" error here
