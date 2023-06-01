public class Stack {
    int top = -1;
    int stack[] = new int[5];

    void push(int number){
        top=top+1;
        stack[top] = number;
    }

    int pop(){
        int poppedElement = stack[top];
       top--;
       return poppedElement;
    }
}
