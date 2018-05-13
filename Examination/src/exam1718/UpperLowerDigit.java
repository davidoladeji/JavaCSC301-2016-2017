package exam1718;

import java.util.Scanner;

public class UpperLowerDigit {

    public static void main(String args[]){
        System.out.print("Enter a single character: ");
        Scanner in = new Scanner(System.in);
        String character = in.next();
        char singlechar = character.charAt(0);
        checkChar(singlechar);

    }
    public static int checkChar(char singlechar){
        int messageInt = 0;
        Character character = singlechar;
        if(Character.isDigit(singlechar)){
            messageInt = 1;
            System.out.println("Character is a Digit");
        }else if(Character.isLetter(singlechar)){

            System.out.println("Character is a Letter");
            if(character.toString().equals(character.toString().toLowerCase())){
                // is lowercase
                messageInt = 2;
                System.out.println("Character is a Lowercase Letter");
            }else {
                messageInt = 3;
                System.out.println("Character is a Uppercase Letter");
            }
        }
        return messageInt;
    }
}
