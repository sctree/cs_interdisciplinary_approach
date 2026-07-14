public class e1_3_17 {
    public static void main(String[] args) {
        //int t = Integer.parseInt(args[0]);
        int P = Integer.parseInt(args[0]); // dollars u invest
        double r = Double.parseDouble(args[1]);

        double Euler = Math.E;

        System.out.printf("%-5s %-5s", "Time", "Money");
        System.out.println();

        for (int i = 0; i < 26; ++i) {
            System.out.printf("%-5d", i);
            double money = P * Math.pow(Euler, r * i);
            System.out.print("$");
            System.out.printf("%-5f", money);
            System.out.println();

        }



    }
}
