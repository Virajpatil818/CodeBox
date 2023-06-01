import java.util.Scanner;

public class Square extends Shape{
    Scanner sc = new Scanner(System.in);
    @Override
    void Area(){
        System.out.println("Enter Side :");
        double side = sc.nextDouble();
        System.out.println("Area of Square :"+(side*side));
    }
    @Override
    void Perimeter(){
        System.out.println("Enter Side :");
        double side = sc.nextDouble();
        System.out.println("Perimeter of Square :"+(4*side));
    }
}
