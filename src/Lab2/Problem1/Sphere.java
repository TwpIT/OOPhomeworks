package Problem1;

public class Sphere extends Shape3D {
    private double radius;

    public Sphere(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Sphere [radius=" + radius + "]";
    }
}
