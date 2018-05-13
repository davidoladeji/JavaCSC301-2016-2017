package exam1617;

import java.util.Scanner;

/**
 * Created by Daveola on 08-Apr-17.
 */
public class WelcomeApp {

    public static void main(String args[]){
        System.out.println("NOTE: This program welcomes users");
        System.out.print("Enter a your name please: ");
        Scanner inout = new Scanner(System.in);
        String enteredname = inout.next();
        System.out.println("Welcome: " + enteredname);
        System.out.print("Do you want to continue? Enter YES/NO: ");
        inout = new Scanner(System.in);
        String enterdCmd = inout.next();
        if (enterdCmd.equalsIgnoreCase("yes")) {
            System.out.print("Enter a your age please: ");
            inout = new Scanner(System.in);
            int enteredage = inout.nextInt();
            System.out.println("Your age is: " + enteredage + "years");
            System.out.print("End of Program");
        }else if(enterdCmd.equalsIgnoreCase("no")){
            System.out.print("End of Program");
        }else{
            System.out.print("Invalid Input");
        }
    }
}
