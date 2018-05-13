package exam1718;

import java.util.Scanner;

public class ReverseString {

    public static void main(String args[]){

       Scanner newInput = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String userString  = newInput.nextLine();
        String reverseString = reverseString(userString);

        System.out.println("Reversed String is: " + reverseString.toLowerCase());
        System.out.println("Palindrom Status is: " + palindromeCheck(userString, reverseString));


    }

    private static String reverseString(String userString){
        String  reversedString = "";
        for (int i= userString.length()-1; i >= 0; i--){
             reversedString = reversedString + userString.charAt(i);
        }
        return reversedString;
    }

    private static boolean palindromeCheck(String userInput, String reverseIput){
        boolean palindromeStatus = false;
        if(userInput.equalsIgnoreCase(reverseIput)){
            palindromeStatus = true;
        }
        return palindromeStatus;
    }
}
