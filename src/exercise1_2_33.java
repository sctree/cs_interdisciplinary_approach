public class exercise1_2_33 {
    public static void main(String[] args) {
        // Great circle
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        /*

        double s1 = Math.sin(x1);
        double s2 = Math.sin(x2);
        double c1 = Math.cos(x1);
        double c2 = Math.cos(x2);
        double c3 = Math.cos(y1 - y2);

        double sin_part = Math.toDegrees(s1) * Math.toDegrees(s2);
        double cos_part = Math.toDegrees(c1) * Math.toDegrees(c2) * Math.toDegrees(c3);
        double back = Math.acos(Math.toRadians(sin_part) + Math.toRadians(cos_part));
        double d = 60 * Math.toDegrees(back);*/

        double sin_part = Math.sin(x1) * Math.sin(x2);
        double cos_part = Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2);
        double d1 = Math.acos(sin_part + cos_part);
        double d = 60 * Math.toDegrees(d1);

        System.out.println(Math.toDegrees(d1));
        System.out.println(d);

    }
}
