import java.util.Scanner;

public class MyMain {
    // Write a method that asks the user to input a double between 0.0 and 1000000.0
    // Your method should keep asking them until they type in a valid value
    // The method returns the final double they type in

    // scan.nextDouble() might be useful here
    public static double inputDouble() {
        Scanner scan = new Scanner(System.in);
        // REPLACE THIS WITH YOUR CODE
        while (true) {
            double scans = -123123123;
            try {
                scans = scan.nextDouble();
            } catch (Exception e) {

            }
            if (scans != -123123123 && scans != -1 && scans < 1000000.0 && scans > 0.0) {
                return scans;
            }
        }
    }

    // Takes a double money as input and returns the number of quarters that we
    // can return in change
    // You should use a while loop!
    public static int numQuarters(double money) {
        // REPLACE THIS WITH YOUR CODE
        return ((int) (money/.25));
    }

    // Takes a double money as input and returns the number of dimes that we
    // can return in change
    // You should use a while loop!
    public static int numDimes(double money) {
        // REPLACE THIS WITH YOUR CODE
        return (int) (money/.1);
    }

    // Takes a double money as input and returns the number of nickels that we
    // can return in change
    // You should use a while loop!
    public static int numNickels(double money) {
        // REPLACE THIS WITH YOUR CODE
        return (int) (money/.05);
    }

    // Takes a double money as input and returns the number of pennies that we
    // can return in change
    // You should use a while loop!
    public static int numPennies(double money) {
        // REPLACE THIS WITH YOUR CODE
        return (int) (money/0.01);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // You should test inputDouble yourself!
        double d = inputDouble();
        int quarters = numQuarters(d);
        double e = d - quarters*0.25;
        int dimes = numDimes(e);
        e = e - dimes*0.1;
        int nickels = numNickels(e);
        e = e - nickels*0.05;
        int pennies = numPennies(e);
        e = e - pennies*0.01;
        System.out.println("You will get "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels, and "+pennies+" pennies.");
        System.out.println("You will have "+(quarters+dimes+nickels+pennies)+" coins in total.");
        // Some code to test numQuarters
        System.out.println("\nnumQuarters tests:");
        System.out.println("1.25 in quarters would be: " + numQuarters(1.25) + " quarters."); // 5
        System.out.println("10.55 in quarters would be: " + numQuarters(10.55) + " quarters."); // 42
        System.out.println("1000000.20 in quarters would be: " + numQuarters(1000000.20) + " quarters."); //4000000

        // Some code to test numDimes
        System.out.println("\nnumDimes tests:");
        System.out.println("1.20 in dimes would be: " + numDimes(1.20) + " dimes."); // 12
        System.out.println("120.13 in dimes would be: " + numDimes(120.13) + " dimes."); //1201
        System.out.println("150.25 in dimes would be: " + numDimes(150.25) + " dimes."); //1502

        scan.close();
    }
}