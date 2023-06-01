package employee;

import java.util.*;

public class Employee {
       String name,address,mailId;
       long mobileNo;
       int id;
       
       Employee(){
    	    name ="";
    	    address ="";
    	    mailId ="";
    	    mobileNo = 0;
    	    id = 0;
       }
      void getdata() {
    	  Scanner sc = new Scanner(System.in);
    	  
    	  System.out.println("Enter Name :");
		  name = sc.next(); 
	      System.out.println("Enter address :");
	      address = sc.next();
	      System.out.println("Enter mailId :");
	      mailId = sc.next();
	      System.out.println("Enter ID :");
	      id = sc.nextInt();
	      System.out.println("Enter Mobile Number :");
	      mobileNo = sc.nextLong();
	       
      }
      void displaydata() {
    	  System.out.println("****************************************");
    	  System.out.println("Name : "+name);
    	  System.out.println("Address : "+address);
    	  System.out.println("Mail Id : "+mailId);
    	  System.out.println("Mobile Number :"+mobileNo);
    	  System.out.println("ID :"+id);
      }
     
}



