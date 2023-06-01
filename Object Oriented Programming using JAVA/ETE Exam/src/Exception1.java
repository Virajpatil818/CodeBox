//SYITB96

import java.util.*;

public class Exception1 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter First Number :");
            num1 = sc.nextInt();

            System.out.println("Enter Second Number :");
            num2 = sc.nextInt();

            int num3 = num1 / num2;
            System.out.println("Division :" + num3);

            int[] array = {1, 2, 3, 4, 5};
            for (int i = 0; i <= array.length; i++) {
                System.out.print(array[i] + " ");
            }

        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("This is : " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nOut of bound");
        }
    }
}