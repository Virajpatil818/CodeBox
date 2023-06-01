package sample;

import java.util.*;

public class Complex {

    public static void main(String args[]) {

        int choice;
        float num1,num2;
        complex_op cal = new complex_op();

        Scanner input= new Scanner(System.in);


        do {
            System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
            choice = input.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter First Number :");
                    num1 = input.nextFloat();
                    num2 = input.nextFloat();
                    complex_op object1 = new complex_op(num1,num2);
                    System.out.println("Enter Second Number :");
                    num1 = input.nextFloat();
                    num2 = input.nextFloat();
                    complex_op object2 = new complex_op(num1,num2);
                    cal.Addition(object1,object2);
                    break;
                case 2:
                    System.out.println("Enter First Number :");
                    num1 = input.nextFloat();
                    num2 = input.nextFloat();
                    complex_op object3 = new complex_op(num1,num2);
                    System.out.println("Enter Second Number :");
                    num1 = input.nextFloat();
                    num2 = input.nextFloat();
                    complex_op object4 = new complex_op(num1,num2);
                    cal.Subtraction(object3,object4);
                    break;
                case 3:
                    System.out.println("Enter First Number :");
                    num1 = input.nextFloat();
                    num2 = input.nextFloat();
                    complex_op object5 = new complex_op(num1,num2);
                    System.out.println("Enter Second Number :");
                    num1 = input.nextFloat();
                    num2 = input.nextFloat();
                    complex_op object6 = new complex_op(num1,num2);
                    cal.Multiplication(object5,object6);
                    break;
                case 4:
                    System.out.println("Enter First Number :");
                    num1 = input.nextFloat();
                    num2 = input.nextFloat();
                    complex_op object7 = new complex_op(num1,num2);
                    System.out.println("Enter Second Number :");
                    num1 = input.nextFloat();
                    num2 = input.nextFloat();
                    complex_op object8 = new complex_op(num1,num2);
                    cal.Division(object7,object8);
                    break;
            }
        }while(choice!=5);
        input.close();
    }
}
class complex_op{
    float real,imag;
    complex_op(){
        real =0;
        imag= 0;
    }
    complex_op(float comp1,float comp2){
        real = comp1;
        imag = comp2;
    }

    public void Addition(complex_op C1,complex_op C2) {
        float real,imag;
        real = (C1.real + C2.real);
        imag = (C1.imag + C2.imag);
        System.out.println("Addition : ("+real+")+("+imag+")i");
    }
    public void Subtraction(complex_op C1,complex_op C2) {
        float real,imag;
        real = (C1.real - C2.real);
        imag = (C1.imag - C2.imag);
        System.out.println("Subtraction : ("+real+")+("+imag+")i");
    }
    public void Multiplication(complex_op C1,complex_op C2) {
        float real,imag;
        real = (C1.real*C2.real - C1.imag*C2.imag);
        imag = (C1.real*C2.imag + C2.real*C1.imag);
        System.out.println("Multiplication : ("+real+")+("+imag+")i");
    }
    public void Division(complex_op C1,complex_op C2) {
        float real,imag;
        real = ((C1.real*C2.real) + (C1.imag*C2.imag)) / ((C2.real*C2.real)+(C2.imag*C2.imag));
        imag = ((C1.imag*C2.real) - (C1.real*C2.imag)) / ((C2.real*C2.real)+(C2.imag*C2.imag));
        System.out.println("Division : ("+real+")+("+imag+")i");
    }
}

