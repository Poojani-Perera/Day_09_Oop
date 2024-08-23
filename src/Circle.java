public class Circle implements Shape{
    double radius;

    public Circle(double newRadius) {
        radius=newRadius;
    }
    public double area() {
        return Math.PI * radius * radius;
        }

}

