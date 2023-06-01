import java.util.*;

public class Main {

    public static void main(String[] args) {

        int choice;

        Scanner sc= new Scanner(System.in);

        Book b= new Book();

        Magazine m =new Magazine();


        do {

            System.out.println("1.Book \n2.Magazine \n3.Total \n4.Exit \nEnter Your Choice :");

            choice=sc.nextInt();


            switch (choice) {

                case 1: {

                    b.read_book();

                    System.out.println("Enter order copies (For Publisher)");

                    int a,c;

                    a=sc.nextInt();

                    b.orderCopies(a);

                    System.out.println("Enter sale copies (For Customer)");

                    c=sc.nextInt();

                    b.saleCopy(c);


                    break;

                }

                case 2:{

                    m.read_mag();

                    int c;

                    m.orderQuantity();

                    System.out.println("Enter sale copies");

                    c=sc.nextInt();

                    m.saleCopy(c);


                    break;

                }

                case 3:{

                    System.out.println("Total:"+(b.total+m.total));


                    break;

                }


            }

        }while(choice!=4);

    }

}

class publication {

    String Title;

    float price;

    int copies,total;

    Scanner sc=new Scanner(System.in);



    public void saleCopy(int copies) {

        this.copies=this.copies-copies;

        total=total+copies;

        System.out.println("Total publication sell:"+(copies*this.price));

    }

    public String getTitle() {

        return Title;

    }

    public void setTitle(String title) {

        Title = title;

    }

    public float getPrice() {

        return price;

    }

    public void setPrice(float price) {

        this.price = price;

    }


    public int getCopies() {

        return copies;

    }

    public void setCopies(int copies) {

        this.copies = copies;

    }

    void read_pub() {

        System.out.println("Enter title");

        String s= sc.next();

        this.setTitle(s);

        System.out.println("Enter price");

        float p= sc.nextInt();

        this.setPrice(p);

        System.out.println("Enter copies available");

        int n=sc.nextInt();

        this.setCopies(n);

    }

    public void display() {

        System.out.print("The title of the book is \n"+Title);

        System.out.print("The amount of the book purchased is "+total+" you have to pay "+total*price);

    }



}

class Book extends publication {

    String author;

    Scanner sc=new Scanner(System.in);

    public void orderCopies(int copies) {

        int x= this.getCopies() + copies;

        setCopies(x);

        System.out.println("No. of copies available = "+x);

    }

    public void read_book(){


        super.read_pub();

        System.out.print("Enter the Author of the book \n");

        this.author=sc.nextLine();
    }


    public void display() {

        super.display();

        System.out.print("author name "+author);


    }
}


class Magazine extends publication {

    int orderQty;

    String Currentissue;

    Scanner sc= new Scanner(System.in);

    public void recieveissue() {

        super.read_pub();

        System.out.println("Enter current issue(dd/mm/yy)");

        this.Currentissue=sc.next();

    }

    public void orderQuantity(){

        System.out.print("Enter the amount of this book you want to purchase\n");

        orderQty=sc.nextInt();

        int x= this.getCopies() + orderQty;

        this.setCopies(x);

    }

    public void display() {

        super.display();

        System.out.println("Current Issue:"+this.Currentissue);


    }


    public void read_mag() {

        this.recieveissue();


    }
}