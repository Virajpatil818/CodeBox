package st;

import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No. of Students  :");
		int n = sc.nextInt();
		
		Info [] in= new Info[n];
		
		for(int i=0;i<n;i++) {
			in[i]=new Info();
            System.out.println("Enter Name of Student :");
            String name = sc.next();
		    in[i].setName(name);
		    System.out.println("Enter roll number :");
		    float rollNo = sc.nextFloat();
			in[i].setRollNo(rollNo);
			System.out.println("Enter age of student :");
			float age = sc.nextFloat();
			in[i].setAge(age);
			System.out.println("Enter Marks of student :");
			float marks = sc.nextFloat();
			in[i].setMarks(marks);
			}
		System.out.println("Name\tRoll no \tAge\tmarks");
		for(int j=0;j<n;j++) {
			System.out.println(in[j].getName()+"\t"+in[j].getRollNo()+"\t"+in[j].getAge()+"\t"+in[j].getMarks());
			System.out.println("");
		}
		
		sc.close();
	}
}
