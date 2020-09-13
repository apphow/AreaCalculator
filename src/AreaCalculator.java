public class AreaCalculator {


    public static double area(double radius) {
        if(radius < 0) {
            return -1;
        }
        double circleRadius = radius * radius * Math.PI;
        return circleRadius;

    }

    public static double area(double x, double y) {
        if(x < 0 ) {
            return -1;
        }
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println(area(24));
        System.out.println(area(2, 4));
    }

}
