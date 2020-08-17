class Circle{
    private double radius=1.0 ;
    private String color="red" ;
  
    Circle(){}

    Circle(double rad,String clr){
        this.radius = rad;
        this.color = clr;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return 3.1415*this.radius*this.radius;
    }
}
public class Program4 extends Circle{
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
    }
}