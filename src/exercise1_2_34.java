public class exercise1_2_34 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        int max1 = Math.max(x, y);
        int max = Math.max(max1, z);

        int min1 = Math.min(x, y);
        int min = Math.min(min1, z);

        int middle = -123;

        boolean x_flag = false;
        boolean y_flag = false;
        boolean z_flag = false;

        if (x != min && x != max) {
            middle = x;
            x_flag = true;
        }
        if (y != min && y != max) {
            middle = y;
            y_flag = true;
        }
        if (z != min && z != max) {
            middle = z;
            z_flag = true;
        }





        System.out.println(min + " " + middle + " " + max);


    }
}
