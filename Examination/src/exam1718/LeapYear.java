package exam1718;

import java.util.Scanner;
public class LeapYear {

    public static void main(String args[]){
        System.out.print("Enter a year: ");
        Scanner in = new Scanner(System.in);
        int yearText = in.nextInt();
        if(yearText%4 == 0){
            System.out.print("Year is a leap year");
        }else {
            System.out.print("Year is not a leap year");
        }
    }
}
