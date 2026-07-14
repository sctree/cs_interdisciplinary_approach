public class e1_3_9 {
    public static void main(String[] args) {
        int low = 1000;
        int high = 2000;

        for (int i = low; i <= high; ++i) {
            if (i % 10 == 0 || i % 10 == 5) {
                System.out.println();
            }
            System.out.print(i + " ");
        }
    }
}
