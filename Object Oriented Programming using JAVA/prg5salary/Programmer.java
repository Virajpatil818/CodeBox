package employee;

import java.util.Scanner;

class Programmer extends Employee{
	Scanner in = new Scanner(System.in);
	double bp,da,hra,pf,club,gross;
	void calculate() {
		System.out.println("Enter Basic Pay :");
		bp = in.nextDouble();
		da = bp * 0.97;
		hra = bp * 0.1;
		pf = bp * 0.12;
		club = bp*0.1;
		gross = bp + da + hra - pf -club; 
		
	}
	void display() {
		System.out.println("DA :"+da);
		System.out.println("HRA :"+hra);
		System.out.println("PF :"+pf);
		System.out.println("Club : "+club);
		System.out.println("Gross Salary :"+gross);
		System.out.println("****************************************");
	}
}
