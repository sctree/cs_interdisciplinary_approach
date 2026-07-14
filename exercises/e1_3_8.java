public class e1_3_8 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int i = 1;
        String suffix = "th";
        while (i <= num)
        { // Print the ith Hello.
            suffix = "th";
            switch (i % 10)
            {
                case 1: suffix = "st"; break;
                case 2: suffix = "nd"; break;
                case 3: suffix = "rd"; break;
            }
            /*
            if (i % 10 == 1) {
                suffix = "st";
            }
            else if (i % 10 == 2) {
                suffix = "nd";
            }
            else if (i % 10 == 3) {
                suffix = "rd";
            }
            else {
                suffix = "th";
            }*/

            System.out.println(i + suffix + " Hello");
            i = i + 1;
        }
    }
}
