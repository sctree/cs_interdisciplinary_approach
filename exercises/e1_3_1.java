public class e1_3_1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // if (a == b == c) { System.out.println("True"); }
        // the reason you can't evaluate a == b even tho they're both integers
        // is because the "==" operator is comparing the memory addresses of the ints,
        // not the int values themselves

        if (!(a > b || a < b) && !(b > c || b < c)) {
            System.out.println("True");
        } else { System.out.println("False"); }

    }
}
