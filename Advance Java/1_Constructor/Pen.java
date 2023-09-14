public class Pen {
    String type;
    String madeBy;
    int price;

    public Pen(String type, String madeBy, int price) {
        this.type = type;
        this.madeBy = madeBy;
        this.price = price;
    }

    public Pen() {
        this.type = "Ballpoint";
        this.madeBy = "Trimax";
        this.price = 40;
    }

    public Pen(Pen pen) {
        this.type = pen.type;
        this.madeBy = pen.madeBy;
        this.price = pen.price;
    }

    void Display() {
        System.out.println("***************");
        System.out.println("Pen Information");
        System.out.println("Type: " + this.type);
        System.out.println("Made by: " + this.madeBy);
        System.out.println("Price: Rs." + this.price);
    }
}