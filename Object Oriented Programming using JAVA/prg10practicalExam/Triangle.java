import java.util.Scanner;

public class Triangle extends Shape{
    Scanner sc = new Scanner(System.in);
    @Override
    void Area(){
        System.out.println("Enter Base and Height :");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Area of triangle :"+(0.5*base*height));
    }
    @Override
    void Perimeter(){
        System.out.println("Enter Sides of Triangle :");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        System.out.println("perimeter of triangle :"+(side1+side2+side3));
    }
}
