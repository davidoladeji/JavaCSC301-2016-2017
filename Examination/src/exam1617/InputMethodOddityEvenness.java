package exam1617;

import java.util.Scanner;

/**
 * Created by Daveola on 08-Apr-17.
 */
public class InputMethodOddityEvenness {
    public static void main(String args[]){
        System.out.print("Enter a number for number of times: ");
        Scanner inout = new Scanner(System.in);
        int counter = inout.nextInt();
        even(counter);
    }

    public static void even(int counter){
        System.out.println("This program determines if a \nnumber you enter is even or odd");
        for(int cnt=1; cnt<=counter; cnt++){
            System.out.print("Enter number " + cnt+ ": ");
            Scanner inout = new Scanner(System.in);
            int enteredNum = inout.nextInt();

            if(enteredNum%2==0){
                System.out.println("This number " + enteredNum + ", is even");
            }else {
                System.out.println("This number " + enteredNum + ", is odd");
            }
        }

    }
}
