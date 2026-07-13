public class e1_3_5 {
    public static void main(String[] args) {
        double r = Math.random();
        String dist1 = "";
        String dist2 = "";
        String dist3 = "";
        String dist4 = "";
        String dist5 = "";
        String dist6 = "";

        for (int i = 0; i < 200; ++i) {
            r = Math.random();

            if (r < 1.0 / 8) {
                dist1 += "|";
            }
            else if (r < 2.0 / 8) {
                dist2 += "|";
            }
            else if (r < 3.0 / 8) {
                dist3 += "|";
            }
            else if (r < 4.0 / 8) {
                dist4 += "|";
            }
            else if (r < 5.0 / 8) {
                dist5 += "|";
            }
            else {
                dist6 += "|";
            }
        }
        System.out.println(dist1);
        System.out.println(dist2);
        System.out.println(dist3);
        System.out.println(dist4);
        System.out.println(dist5);
        System.out.println(dist6);
        /*
        if (r < 1.0 / 8) {
            System.out.println("Rolled a 1!");
        }
        else if (r < 2.0 / 8) {
            System.out.println("Rolled a 2!");
        }
        else if (r < 3.0 / 8) {
            System.out.println("Rolled a 3!");
        }
        else if (r < 4.0 / 8) {
            System.out.println("Rolled a 4!");
        }
        else if (r < 5.0 / 8) {
            System.out.println("Rolled a 5!");
        }
        else {
            System.out.println("Rolled a 6!");
        }*/
    }
}
