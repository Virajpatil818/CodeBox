public class Bicycle implements Vehicle {
    @Override
    public int changeGear(int speed, int gear, int a) {
        if (a <= 4) {
            if (a == 1 && speed <= 5) {
                gear = a;
                System.out.println("Your Gear is changes to " + gear);
                return gear;
            } else if (a == 2 && speed > 5 && speed <= 10) {
                gear = a;
                System.out.println("Your Gear is changes to " + gear);
                return gear;
            } else if (a == 3 && speed > 10 && speed <= 20) {
                gear = a;
                System.out.println("Your Gear is changes to " + gear);
                return gear;
            } else if (a == 4 && speed > 20){
                gear = a;
                System.out.println("Your Gear is changes to  " + gear);
                return gear;
            }else {
                System.out.println("Enter Gear relevant to your speed ");
            }
        } else {
            System.out.println("!! Warning !! Enter gear between { 0 - 4 }");
        }
        return gear;
    }

    @Override
    public int speedUp(int gear, int b) {
        if (gear == 1 && b <= 5) {
            System.out.println("Your Speed is changes to " + b);
            return b;
        } else if (gear == 2 && b > 5 && b <= 10) {
            System.out.println("Your Speed is changes to " + b);
            return b;
        } else if (gear == 3 && b > 10 && b <= 20) {
            System.out.println("Your Speed is changes to " + b);
            return b;
        } else {
            System.out.println("Your Speed is changes to  " + b);
            return b;
        }
    }


    @Override
    public int applyBrakes(int speed, int c) {
        if (c == 1) {
            if (speed >= 5) {
                System.out.println("Brakes are applied : Speed is " + (speed - 5));
                return (speed-5);
            }else {
                System.out.println("!! Warning !! Speed is Low \n Vehicle will stop");
            }
        } else if (c == 2) {
            speed = 0;
            System.out.println("Bicycle is stopped");
        }
        return speed;
    }

}
