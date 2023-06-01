package employee;

import java.util.*;

public class Main {
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   int choice;
    	   int basicPay,id;
    	   long mobileNo;
    	   String name,address,mailId;
    	   do {
    		   System.out.println("Enter Role of Employee:");
    		   System.out.println("1.Programmer\n2.Team Lead\n3.Assistant Program manager\n4.Project Manager\n5.EXIT");
        	   choice = sc.nextInt();
        	   Employee em = new Employee();
        	   Programmer pro = new Programmer();
        	   TeamLead teamL = new TeamLead();
        	   AstproManager atpro = new AstproManager();
        	   ProManager proman = new ProManager();
    	switch(choice) {
    	   
    	   case 1:
    		   em.getdata();
    		   pro.calculate();
    		   em.displaydata();
    		   pro.display();
    		   break;
    	  case 2:
    		   em.getdata();
    		   teamL.calculate();
    		   em.displaydata();
    		   teamL.display();
    		   break;
    	   case 3:
    		   em.getdata();
    		   atpro.calculate();
    		   em.displaydata();   		   
    		   atpro.display();
    		   break;
    	   case 4:
    		   em.getdata();
    		   proman.calculate();
    		   em.displaydata();
    		   proman.display();
    		   break;
    	   }
    	   }while(choice!=5);
       }
       
}
