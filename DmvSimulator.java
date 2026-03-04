import java.util.Scanner;

public class DmvSimulator {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Welcome to the DMV!");
        
        System.out.println("Enter a number from 1 to 200");
        int dmvNumber = in.nextInt();
        int actualNumber = dmvNumber + 1;

        for (int i = 0; i < 200; i++) {
            System.out.println("Now serving number: " + actualNumber);
            if (actualNumber > 199) {
                actualNumber = 1;
            } else {
                actualNumber ++;
            }
            if (actualNumber == dmvNumber) {
                break;
            }
        }

        int randomNum = int (Math.random() * 100);
        
        if (randomNum == 50) {
            System.out.println("You do have the right paper work. You are all set. ")
        } else {
            System.out.println("Sorry dumb number " + dmvNumber + ", you do not have anything remotely close to the right paperwork.");
        }
    }
}