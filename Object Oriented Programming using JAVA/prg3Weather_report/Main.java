package viraj;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        float highTemp_avg = 0,lowTemp_avg = 0,amountRain_avg = 0,amountSnow_avg = 0;
        System.out.println("Enter Days :");
        int n=sc.nextInt();
        
        Weather[] w = new Weather[n];
        
        for(int i=0;i<n;i++) {
        	w[i]=new Weather();
        	System.out.println("Enter Day of Month :");
        	float day_of_month = sc.nextFloat();
        	w[i].setDay_of_month(day_of_month);
        	System.out.println("Enter High Temperature :");
        	float highTemp = sc.nextFloat();
        	w[i].setHighTemp(highTemp);
        	System.out.println("Enter low Temperature :");
        	float lowTemp = sc.nextFloat();
        	w[i].setLowTemp(lowTemp);
        	System.out.println("Enter Amount of Rain :");
        	float amountRain = sc.nextFloat();
        	w[i].setAmountRain(amountRain);
        	System.out.println("Enter Amount of Snow :");
        	float amountSnow = sc.nextFloat();
        	w[i].setAmountSnow(amountSnow);
        	System.out.println("");
        }
        
        for(int j=0;j<n;j++) {
        	highTemp_avg += w[j].getHighTemp();
        	lowTemp_avg += w[j].getLowTemp();
        	amountRain_avg += w[j].getAmountRain();
        	amountSnow_avg += w[j].getAmountSnow();      	
        }
        
        System.out.println("Average High Temperature : " + highTemp_avg/n);
        System.out.println("Average Low Temperature : " + lowTemp_avg/n);
        System.out.println("Average Amount Rain : " + amountRain_avg/n);
        System.out.println("Average Amount Snow : " + amountSnow_avg/n);
        
        sc.close();    
	}

}
