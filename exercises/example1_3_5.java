public class example1_3_5 {
    public static void main(String[] args) {
        // Harmonic numbers
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        System.out.println(sum);
    }
}
