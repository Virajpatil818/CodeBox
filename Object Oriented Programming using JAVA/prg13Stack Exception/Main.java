//SYIT96
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        int choice;
       do {
           System.out.println("1.Push\n2.Pop\n3.EXIT");
           choice = sc.nextInt();

           switch (choice) {
               case 1 -> {
                   try {
                       System.out.println("Enter number to push :");
                       int number = sc.nextInt();
                       s.push(number);
                   } catch (ArrayIndexOutOfBoundsException e) {
                       System.out.println("Out of bound");
                   }
               }
               case 2 -> {
                   try {
                       int poppedElement = s.pop();
                   } catch (Exception e) {
                       System.out.println(e);
                   }
               }
           }
       }while (choice != 3);
    }
}

