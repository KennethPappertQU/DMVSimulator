import java.util.Scanner;

public class DmvSimulator {
    public void main (String [] args) {
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
        System.out.println("Sorry number " + dmvNumber + ", you do not have the right paperwork.");
    }
}
