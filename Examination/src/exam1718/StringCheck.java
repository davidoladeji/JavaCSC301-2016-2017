package exam1718;

import java.util.Scanner;

public class StringCheck {

    public static void main(String args[]){

       Scanner newInput = new Scanner(System.in);

        System.out.print("Please enter a single character: ");
        char userChar = newInput.next().charAt(0);
        while (userChar!='$'){
            charCheck(userChar);
            System.out.print("Please enter a single character: ");
            userChar = newInput.next().charAt(0);

        }


    }

    private static void charCheck(char c){

        if(Character.isLetter(c)){
            System.out.println("Its a Letter you just Typed");
        }else{
            System.out.println("You didn't type a letter");
            if (Character.isDigit(c)){
                System.out.println("Its a Digit you just Typed");
            }else{
                System.out.println("You didn't type a Digit");
            }
        }

    }
}
