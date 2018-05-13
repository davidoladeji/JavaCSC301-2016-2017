package exam1718;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String args[]) {
        int arrayNum[] = {4, 5, 60, 8, 6, 7, 20, 10, 2, 15};
        boolean numfound = false;
        String numIndex = null;

        System.out.print("Please enter a number to search for: ");
        Scanner in = new Scanner(System.in);
        int userNum = in.nextInt();

        for(int i =0; i<=arrayNum.length-1; i++){
            if (userNum == arrayNum[i]){
                numfound = true;
                System.out.print("Number is at index: " + i);
                numIndex =""+i;
            }
        }
        if(numIndex == null){
            System.out.print("Number not found ");
        }

    }
}
