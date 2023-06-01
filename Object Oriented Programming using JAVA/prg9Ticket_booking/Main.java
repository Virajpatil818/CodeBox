import java.util.*;

public class Main {
    public static void main(String[] args) {

        int choice = 0;
        int available_Ticket = 40;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("*************************************");
            System.out.println("Enter Number of Tickets :");
            int ticket_Number = sc.nextInt();
            System.out.println("Enter Ticket Category :");
            System.out.println("1.Gold \n2.Platinum \n3.Silver \n4.EXIT");
            choice = sc.nextInt();
            if(ticket_Number <= available_Ticket){
                switch (choice){
                    case 1:
                        if(ticket_Number >= 5){
                            System.out.println("**************************************");
                            System.out.println("Congrats !! You got Discount of 5% ");
                            double discount_price = Ticket.priceCalculation_gold(ticket_Number)-Ticket.priceCalculation_gold(ticket_Number)*0.05;
                            System.out.println("Total Ticket Price : "+discount_price);
                        }
                        else{
                            System.out.println("Total Ticket Price :"+Ticket.priceCalculation_gold(ticket_Number));
                        }
                        available_Ticket = available_Ticket - ticket_Number;
                        System.out.println("Available Tickets :"+available_Ticket);
                        System.out.println("**************************************");
                        break;
                    case 2:
                        System.out.println("**************************************");
                        System.out.println("Total Ticket Price :"+Ticket.priceCalculation_platinum(ticket_Number));
                        available_Ticket = available_Ticket - ticket_Number;
                        System.out.println("Available Tickets :"+available_Ticket);
                        System.out.println("**************************************");
                        break;
                    case 3:
                        System.out.println("**************************************");
                        System.out.println("Total Ticket Price :"+Ticket.priceCalculation_silver(ticket_Number));
                        available_Ticket = available_Ticket - ticket_Number;
                        System.out.println("Available Tickets :"+available_Ticket);
                        System.out.println("**************************************");
                        break;

                }
            }
            else{
                System.out.println("**************************************");
                System.out.println("Sorry for inconvenience \n Tickets are not available");
                System.out.println("Available Tickets :"+available_Ticket);
                System.out.println("**************************************");
            }
        }while(choice!=4);

    }
}