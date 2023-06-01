public class Ticket {
    double price;
    double total_price;

    public Ticket(double price, double total_price) {
        this.price = price;
        this.total_price = total_price;
    }

    static double priceCalculation_gold(int ticket_Number){
        double total_price;
        total_price = ticket_Number *100;
        return total_price;
    }

    static double priceCalculation_platinum(int ticket_Number){
        double total_price;
        total_price = ticket_Number *200;
        return total_price;
    }

    static double priceCalculation_silver(int ticket_Number){
        double total_price;
        total_price = ticket_Number *80;
        return total_price;
    }


}
