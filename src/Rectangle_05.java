public class Rectangle_05 implements  Shape_q5{
    double width;
    double height;

    public Rectangle_05(double width,double height) {
        this.width =width;
        this.height= height;
    }

    public double area(){
        return width * height;
    }
}
