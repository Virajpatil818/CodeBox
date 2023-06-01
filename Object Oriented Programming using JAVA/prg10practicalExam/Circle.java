import java.util.Scanner;
public class Circle extends Shape{
    Scanner sc = new Scanner(System.in);
    @Override
    void Area(){
        System.out.println("Enter Radius :");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle :"+(3.14*radius*radius));
    }
    @Override
    void Perimeter(){
        System.out.println("Enter Radius :");
        double radius = sc.nextDouble();
        System.out.println("Perimeter of Circle :"+(2*3.14*radius));
    }
}
