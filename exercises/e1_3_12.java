public class e1_3_12 {
    public static void main(String[] args) {
        // Function growth table

        //System.out.println("log n\t\t" + "n\t" + "nloge n\t\t\t" + "n^2\t\t" + "n^3\t\t\t" +  "2^n");
        System.out.printf("%-12s %-6s %-15s %-10s %-12s %-20s%n",
                "log n", "n", "n log n", "n^2", "n^3", "2^n");
        for (int i = 16; i <= 2048; i *= 2) {
            /*
            System.out.print(Math.log(i) + "\t");
            System.out.print(i + "\t");
            System.out.print(i * Math.log(i) + "\t");
            System.out.print(i * i + "\t\t");
            System.out.print(i * i * i + "\t\t\t");
            System.out.print(Math.pow(2, i) + "\t");
            System.out.println();*/

            System.out.printf("%-12.4f %-6d %-15.2f %-10d %-12d %-20.2e%n",
                    Math.log(i),
                    i,
                    i * Math.log(i),
                    i * i,
                    i * i * i,
                    Math.pow(2, i));
        }


    }
}
