public class exercise1_2_24 {
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);
        int P = Integer.parseInt(args[1]);

        double Euler = Math.E;

        double r = 0.25;

        double s = r * t;
        double money = P * Math.pow(Euler, r * t);

        System.out.println("$" + money);



    }
}
