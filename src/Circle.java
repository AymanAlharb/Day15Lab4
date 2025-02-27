public class Circle extends Shape {
    private double radius;

    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius*radius;
    }

    @Override
    public double calculateCircumference() {
        return 2*Math.PI*radius;
    }
}
