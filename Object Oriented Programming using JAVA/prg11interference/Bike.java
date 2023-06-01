public class Bike implements Vehicle{
    @Override
    public int changeGear(int speed, int gear, int a) {
        if (a <= 5) {
            if (a == 1 && speed <= 20) {
                gear = a;
                System.out.println("Your Gear is changes to " + gear);
                return gear;
            } else if (a == 2 && speed > 20 && speed <= 40) {
                gear = a;
                System.out.println("Your Gear is changes to " + gear);
                return gear;
            } else if (a == 3 && speed > 40 && speed <= 60) {
                gear = a;
                System.out.println("Your Gear is changes to " + gear);
                return gear;
            } else if (a == 4 && speed > 60 && speed <= 80){
                gear = a;
                System.out.println("Your Gear is changes to  " + gear);
                return gear;
            }else if (a == 5 && speed > 80){
                gear = a;
                System.out.println("Your Gear is changes to  " + gear);
                return gear;
            }else {
                System.out.println("Enter Gear relevant to your speed ");
            }
        } else {
            System.out.println("!! Warning !! Enter gear between { 0 - 5 }");
        }
        return gear;
    }

    @Override
    public int speedUp(int gear, int b) {
        if (gear == 1 && b <= 20) {
            System.out.println("Your Speed is changes to " + b);
            return b;
        } else if (gear == 2 && b > 20 && b <= 40) {
            System.out.println("Your Speed is changes to " + b);
            return b;
        } else if (gear == 3 && b > 40 && b <= 60) {
            System.out.println("Your Speed is changes to " + b);
            return b;
        } else if(gear == 4 && b > 60 && b <= 80){
            System.out.println("Your Speed is changes to  " + b);
            return b;
        }else{
            System.out.println("Your Speed is changes to  " + b);
            return b;
        }
    }


    @Override
    public int applyBrakes(int speed, int c) {
        if (c == 1) {
            if (speed >= 15) {
                System.out.println("Brakes are applied : Speed is " + (speed - 15));
                return (speed-15);
            }else {
                System.out.println("!! Warning !! Speed is Low \n Vehicle will stop");
            }
        } else if (c == 2) {
            speed = 0;
            System.out.println("Bike is stopped");
        }
        return speed;
    }
}
