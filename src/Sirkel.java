public class Sirkel {
    public static double diameter(double radius) {
        return 2*radius;
    }

    public static double omkrets(double radius) {
        return 2*Math.PI*radius;
    }

    public static double areal(double radius) {
        return Math.PI*Math.pow(radius,2);
    }

    public static void main(String[] args) {
        double radius = 21;
        System.out.println(diameter(radius));
        System.out.println(omkrets(radius));
        System.out.println(areal(radius));
    }
}