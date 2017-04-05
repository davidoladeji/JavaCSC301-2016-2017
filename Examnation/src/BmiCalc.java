import java.util.Scanner;

/**
 * Created by Daveola on 05-Apr-17.
 */
public class BmiCalc
{

  /**  Write a complete java Program that uses at least two methods
   *  (for different functions or parts of the calculator)
   *  to calculate
   *     Body Mass Index (BMI) =    (  weightInKilograms)/(heightInMeters ×heightInMeters)
   *     Using the formula above,
   *     create a BMI calculator that reads the user’s weight in kilograms and height
   *     in meters then calculates and displays the user’s BMI using the following standard BMI information.
   *     * Underweight: less than 18.5
   *    * Normal: between 18.5 and 24.9
   *    * Overweight: between 25 and 29.9
   *    * Obese: 30 or greater
   *
   *
   * */


  public static void main(String args[]){

      double bmi, weightInKG, heightInMeters;

      System.out.print("Enter the weight (in Kilograms): ");
      Scanner inout = new Scanner(System.in);
      weightInKG = inout.nextDouble();
      System.out.print("Enter the height (in Meters): ");
      inout = new Scanner((System.in));
      heightInMeters = inout.nextDouble();

      //Calculate BMI
      bmi = bmiCalculator(weightInKG, heightInMeters);
      //Use results in printing out message to user
      printResults(checkBMI(bmi), weightInKG,heightInMeters);

  }


    //method to calculate the bmi
    public static double bmiCalculator(double weight, double height){
        double bmi = (weight)/(Math.pow(height,2));
        return bmi;
    }

    // Method to Check the Underwight or Overwight
    public static String checkBMI(double bmiResult){
        if (bmiResult < 18.5 ){
            return "Underweight"; //Underweight
        }else if(bmiResult >= 18.5 && bmiResult <= 24.9 ){
            return "Normal"; //Normal
        }else if(bmiResult >= 25.0 && bmiResult <= 29.9){
            return "Overweight"; //Overweight
        }else if (bmiResult > 30) {
            return "Obese";
        }else {
            return "Unknown";
        }
    }

    public static void printResults(String bmiResult, double weight, double height){
        System.out.println("The person with weight " + weight + " and height " + height + " by BMI standards is: " + bmiResult);

    }

}
