package bester;

public class Rectangle implements Comparable {
    private double length;
    private double breadth;

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    public double area() {
        return length * breadth;
    }

    @Override
    public boolean betterThan(Comparable other) {
        return area() > ((Rectangle) other).area();
    }
}
