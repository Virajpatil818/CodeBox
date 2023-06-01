import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double a1;
       double b1;
       double a2;
       double b2;

       Shape shape = new Rectangle();
       System.out.println("Enter Length and Breadth of Rectangle :");
       a1 = sc.nextDouble();
       shape.setVar1(a1);
       b1 = sc.nextDouble();
       shape.setVar2(b1);
       shape.ComputeArea();

       Shape shape2 = new Triangle();
       System.out.println("Enter Height and Base of Triangle :");
       a2 = sc.nextDouble();
       shape2.setVar1(a2);
       b2 = sc.nextDouble();
       shape2.setVar2(b2);
       shape2.ComputeArea();
    }
}