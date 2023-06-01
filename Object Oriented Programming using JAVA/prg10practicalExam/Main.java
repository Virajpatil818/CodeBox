import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Shape s1 = new Circle();
        Shape s2 = new Square();
        Shape s3 = new Triangle();
        do {
            System.out.println("1.Circle\n2.Square\n3.Triangle\n4.EXIT");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    s1.Perimeter();
                    s1.Area();
                }
                case 2 -> {
                    s2.Perimeter();
                    s2.Area();
                }
                case 3 -> {
                    s3.Perimeter();
                    s3.Area();
                }
            }
        }while(choice != 4);
    }
}