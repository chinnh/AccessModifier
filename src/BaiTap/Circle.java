package BaiTap;

public class Circle {
    private static int count = 0;
    private static final double PI = 3.14;
    private int id;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.id = ++count;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public static int getCount() {
        return count;
    }

    public static Circle getMaxRadius(Circle[] circles) {
        Circle maxCircle = null;
        double maxRadius = 0;
        for (Circle c : circles) {
            if (c.getRadius() > maxRadius) {
                maxRadius = c.getRadius();
                maxCircle = c;
            }
        }
        return maxCircle;
    }

    public static double getTotalArea(Circle[] circles) {
        double totalArea = 0;
        for (Circle c : circles) {
            totalArea += c.getArea();
        }
        return totalArea;
    }

    @Override
    public String toString() {
        return "Circle [id=" + id + ", radius=" + radius + "]";
    }
}
