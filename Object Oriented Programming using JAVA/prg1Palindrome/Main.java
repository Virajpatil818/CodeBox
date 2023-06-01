package sample;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Numer :");
        int n=sc.nextInt();
        int a=n;
        int p=0;

        while(n!=0){
            p=p*10+n%10;
            n=n/10;
        }

        if(a==p)
            System.out.println("Palindrome");
        else
            System.out.println("NOT Palindrome");
    }
}