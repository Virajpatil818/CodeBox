import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double var1;
        double var2;
        int var3;
        double var4;
        double var5;

        do {
            System.out.println("----------Select Shape----------");
            System.out.println("1.Square \n2.Rectangle \n3.Circle \n4.Triangle \n5.Pentagon \n6.EXIT");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Side :");
                    var1 = sc.nextDouble();
                    Perimeter(var1);
                    break;
                case 2:
                    System.out.println("Enter Length and Breadth :");
                    var1 = sc.nextDouble();
                    var2 = sc.nextDouble();
                    Perimeter(var1, var2);
                    break;
                case 3:
                    System.out.println("Enter radius :");
                    var3 = sc.nextInt();
                    Perimeter(var3);
                    break;
                case 4:
                    System.out.println("Enter Sides (3 Sides) :");
                    var1 = sc.nextDouble();
                    var2 = sc.nextDouble();
                    var3 = sc.nextInt();
                    Perimeter(var1, var2, var3);
                    break;
                case 5:
                    System.out.println("Enter Sides of Pentagon (5 Sides) :");
                    var1 = sc.nextDouble();
                    var2 = sc.nextDouble();
                    var3 = sc.nextInt();
                    var4 = sc.nextDouble();
                    var5 = sc.nextDouble();
                    Perimeter(var1, var2, var3, var4, var5);
                    break;

            }
        } while (choice != 6);
    }

    static void Perimeter(double var1) {
        System.out.println("Perimeter of Square : " + (var1 * 4));
    }

    static void Perimeter(double var1, double var2) {
        System.out.println("Perimeter of Rectangle : " + (var1 * 2 + var2 * 2));
    }

    static void Perimeter(int var3) {
        System.out.println("Perimeter of Square : " + (2 * 3.14 * var3));
    }

    static void Perimeter(double var1, double var2, int var3) {
        System.out.println("Perimeter of Rectangle : " + (var1 + var2 + var3));
    }

    static void Perimeter(double var1, double var2, int var3, double var4, double var5) {
        System.out.println("Perimeter of Rectangle : " + (var1 + var2 + var3 + var4 + var5));
    }
}