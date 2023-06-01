//SYITB96

import java.util.*;

public class Exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        int choice;
        do {
            System.out.println("1.Push\n2.Pop\n3.Exit");
            choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1 -> {
                        int num;
                        System.out.println("Enter number");
                        num = sc.nextInt();
                        s.push(num);
                    }
                    case 2 -> {
                        int PoppedNum = s.pop();
                        System.out.println("Popped element: " + PoppedNum);
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception occurred: " + e.getMessage());
            }
        } while (choice != 3);
    }
}

class Stack {
    int[] s = new int[5];
    int top = -1;

    public void push(int a) throws Exception {
        if (top == 4) {
            throw new Exception("Stack is full");
        }
        top++;
        s[top] = a;
    }

    public int pop() throws Exception {
        if (top == -1) {
            throw new Exception("Stack is empty");
        }
        int PoppedNum = s[top];
        top--;
        return PoppedNum;
    }
}
