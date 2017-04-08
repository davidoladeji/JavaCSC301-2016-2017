import java.util.Random;

/**
 * Created by Daveola on 07-Apr-17.
 */
public class GuessAMehn {


    /** A.	Write a method named iGuessIt that will
     *   i.     output random numbers between 1 and 50 inclusive until it outputs one of at least 48.
     *   ii.    Print out each guess and
     *   iii.   Print out the total number of guesses made.
     *          Important: Use an in-built library
     */


    /**
     * Sample Output
     * Iteration 1: 25
     * Iteration 2: 13
     * Iteration 3: 10
     * Iteration 4: 32
     * Iteration 5: 27
     * Iteration 6: 20
     * Iteration 7: 38
     * Iteration 8: 25
     * Iteration 9: 17
     * Iteration 10: 21
     * Iteration 11: 3
     * Iteration 12: 49
     * Total number of iterations: 12
     *
     */

    public static void main (String args[]){

        int cnt =1;

        //for 50 to be inclusive, max is set as 51
       iGuessIt(51,1);



        }





    public static void iGuessIt(int max, int min){


        int randomNum = 0;
        int resultRand = 0;
        int cnt = 0;

        //Use the do ... while to allow the statement run at least once

        do{

            //Use the Random class

            Random r = new Random();  //Create an instance "r" of the class Random
            randomNum = r.nextInt(max-min) + min; // Set the minimum and maximum bounds
            cnt++;  //increment the counter to know how many times we had to do this
            resultRand = randomNum; //move the value of the randomly generated number into another variable
            System.out.println("Iteration "+ cnt+ ": " + resultRand); //Print the current random value
        }while (resultRand < 48); //Check if value is > (greater than) or = (equal to) 48 i.e. if less tha 48 is true then re-do the do ;-)
        System.out.println("Total number of iterations: " + cnt);

      //  return randomNum;
    }
}
