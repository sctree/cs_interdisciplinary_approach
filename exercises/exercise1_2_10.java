public class exercise1_2_10 {
    public static void main(String[] args) {
        int a = 2147483647;
        // int a = Integer.MAX_VALUE;

        System.out.println(a);
        System.out.println(a+1);
        System.out.println(2-a);
        System.out.println(-2-a);
        System.out.println(2*a);
        System.out.println(2*2147483647);
        System.out.println(4*a);

        //exercise 1.2.11
        double b = 3.14159;
        System.out.println(b);
        System.out.println(b+1);
        System.out.println(8/(int) b);
        System.out.println(8/b);
        System.out.println((int) (8/b));

        System.out.println((Math.sqrt(2) * Math.sqrt(2)) == 2);

    }
}
