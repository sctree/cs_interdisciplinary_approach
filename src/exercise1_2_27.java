public class exercise1_2_27 {
    public static void main(String[] args) {

        double u = Math.random();
        double v = Math.random();

        r = (Math.sin(2 * Math.PI * v)) * Math.pow((-2 * Math.log(u)), 0.5);
        // Gaussian random numbers based on the Box-Muller formula

        System.out.println(r);
    }
}
