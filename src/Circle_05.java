public class Circle_05 implements  Shape_q5{
    double radius;

    public Circle_05(double Newradius) {
        radius = Newradius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}
