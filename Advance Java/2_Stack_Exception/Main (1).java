package com.lab2_java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int choice;
        
        do {
            System.out.println("1.Push\n2.Pop\n3.Exit");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        stack.push();
                        break;
                    case 2:
                        int popped = stack.pop();
                        System.out.println("Popped Element: " + popped);
                        break;
                }
            } catch (StackOperationException e) {
                System.out.println("Error Code: " + e.getErrorCode());
                System.out.println("Error Message: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Exception Found: " + e.getMessage());
            }
        } while (choice != 3);
    }
}

class StackOperationException extends Exception {
    private int errorCode;

    public StackOperationException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}

class Stack {
    int top = -1;
    Scanner sc = new Scanner(System.in);
    int[] stack = new int[5];

    void push() throws StackOperationException {
        if (top == 4) {
            throw new StackOperationException(1, "Stack Overflow");
        }
        System.out.println("Enter number to push:");
        int n = sc.nextInt();
        top = top + 1;
        stack[top] = n;
    }

    int pop() throws StackOperationException {
        if (top == -1) {
            throw new StackOperationException(2, "Stack Underflow");
        }
        int n = stack[top];
        top--;
        return n;
    }
}
