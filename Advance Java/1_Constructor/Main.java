import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter type of Pen:");
        String type = sc.next();
        System.out.println("Enter Company of Pen:");
        String madeBy = sc.next();
        System.out.println("Enter Price of Pen:");
        int price = sc.nextInt();

        Pen pen1 = new Pen(type, madeBy, price);
        pen1.Display();


        Pen pen2 = new Pen();
        pen2.Display();

        Pen pen3 = new Pen(pen1);
        pen3.Display();


    }
}