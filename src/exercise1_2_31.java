public class exercise1_2_31 {
    public static void main(String[] args) {
        // Mercator projection

        double lambda_0 = Double.parseDouble(args[0]);
        double latitude = Double.parseDouble(args[1]);
        double longitude = Double.parseDouble(args[2]);

        lambda_0 = Math.toRadians(lambda_0);
        latitude = Math.toRadians(latitude);
        longitude = Math.toRadians(longitude);

        double num = 1 + Math.sin(latitude);
        double denom = 1 - Math.sin(latitude);

        double x = longitude - lambda_0;
        double y = (0.5) * (num / denom);

        System.out.println(x + ", " + y);

        System.out.println(Math.toRadians(x) + ", " + Math.toRadians(y));

    }
}
