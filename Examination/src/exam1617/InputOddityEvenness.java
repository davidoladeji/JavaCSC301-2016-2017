package exam1617;

import java.util.Scanner;

/**
 * Created by Daveola on 08-Apr-17.
 */
public class InputOddityEvenness {


    public static void main(String args[]){

        System.out.println("NOTE: This program determines if a \nnumber you enter is even or odd");
        System.out.print("Enter a number: ");
        Scanner inout = new Scanner(System.in);
        int enteredNum = inout.nextInt();

        if(enteredNum%2==0){
            System.out.print("This number " + enteredNum + ", is even");
        }else {
            System.out.print("This number " + enteredNum + ", is odd");
        }

    }
}
