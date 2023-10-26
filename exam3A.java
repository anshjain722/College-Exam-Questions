/*Describe abstract class called Shape, which has three subclass Triangle,Rectangle and Circle
 * Define one method area() in the abstract class and override it in these three other subclasses
 * to calculate for specific area of all three Triangle , Rectangle and Circle
*/
abstract class Shape{
    abstract double area();
}

class Triangle extends Shape{
    double base;
    double height;

    Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    @Override
    double area(){
        return 0.5 * base * height;
    }
     
}
class Rectangle extends Shape{
    double length;
    double breadth;

    Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double area(){
        return length * breadth;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double area(){
        return 3.14 * radius * radius;
    }
}


public class exam3A {
    public static void main(String[] args) {
       Triangle t = new Triangle(10,10);
       Rectangle r = new Rectangle(10, 10);
       Circle c = new Circle(10);

       System.out.println("Area of Triangle: " + t.area());
       System.out.println("Area of Rectangle: " + r.area());
       System.out.println("Area of Circle: " + c.area());
       System.out.println("Created by one and only AN.sh ");;
    }
    
}
