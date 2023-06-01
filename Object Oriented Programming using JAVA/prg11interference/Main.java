import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter your choice :");
            System.out.println("1.Bicycle\n2.Bike\n3.Car\n");
            choice = input.nextInt();
            Vehicle vehicle = new Bicycle();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter current Speed :");
                    int speed = input.nextInt();
                    System.out.println("Enter previous Gear :");
                    int gear = input.nextInt();
                    System.out.println("1.Gear change\n2.Speed change\n3.Brakes ");
                    int choose = input.nextInt();
                    switch (choose) {
                        case 1 -> {
                            System.out.println("Enter changed Gear :");
                            int a = input.nextInt();
                            gear = vehicle.changeGear(speed, gear, a);
                            System.out.println(gear);
                        }
                        case 2 -> {
                            System.out.println("Enter Changed Speed :");
                            int b = input.nextInt();
                            speed = vehicle.speedUp(gear, b);
                            System.out.println(speed);
                        }
                        case 3 -> {
                            System.out.println("1.Apply Brakes\n2.Stop Bicycle");
                            int c = input.nextInt();
                            speed = vehicle.applyBrakes(speed, c);
                            System.out.println(speed);
                        }
                    }
                }
                case 2 -> {
                    vehicle = new Bike();
                    System.out.println("Enter current Speed :");
                    int speed = input.nextInt();
                    System.out.println("Enter previous Gear :");
                    int gear = input.nextInt();
                    System.out.println("1.Gear change\n2.Speed change\n3.Brakes ");
                    int choose = input.nextInt();
                    switch (choose) {
                        case 1 -> {
                            System.out.println("Enter changed Gear :");
                            int a = input.nextInt();
                            gear = vehicle.changeGear(speed, gear, a);
                            System.out.println(gear);
                        }
                        case 2 -> {
                            System.out.println("Enter Changed Speed :");
                            int b = input.nextInt();
                            speed = vehicle.speedUp(gear, b);
                            System.out.println(speed);
                        }
                        case 3 -> {
                            System.out.println("1.Apply Brakes\n2.Stop Bicycle");
                            int c = input.nextInt();
                            speed = vehicle.applyBrakes(speed, c);
                            System.out.println(speed);
                        }
                    }
                }
                case 3 -> {
                    vehicle = new Car();
                    System.out.println("Enter current Speed :");
                    int speed = input.nextInt();
                    System.out.println("Enter previous Gear :");
                    int gear = input.nextInt();
                    System.out.println("1.Gear change\n2.Speed change\n3.Brakes ");
                    int choose = input.nextInt();
                    switch (choose) {
                        case 1 -> {
                            System.out.println("Enter changed Gear :");
                            int a = input.nextInt();
                            gear = vehicle.changeGear(speed, gear, a);
                            System.out.println(gear);
                        }
                        case 2 -> {
                            System.out.println("Enter Changed Speed :");
                            int b = input.nextInt();
                            speed = vehicle.speedUp(gear, b);
                            System.out.println(speed);
                        }
                        case 3 -> {
                            System.out.println("1.Apply Brakes\n2.Stop Bicycle");
                            int c = input.nextInt();
                            speed = vehicle.applyBrakes(speed, c);
                            System.out.println(speed);
                        }
                    }
                }
            }

        } while (choice != 4);
    }
}