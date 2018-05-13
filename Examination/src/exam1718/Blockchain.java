package exam1718;

public class Blockchain {

    public static void main(String args[]){

        boolean flutterNumber = flutterUp(iAmStrong(407), bullishRise(3));
        System.out.println("The flutterCheck: "+ flutterNumber);

    }
    private static boolean iAmStrong(int number){
        boolean numberStatus = false;
        int copyOfNumber = number;
        int noOfDigits = String.valueOf(number).length();
        int sum = 0;
        while (copyOfNumber != 0)
        {
            int lastDigit = copyOfNumber % 10;
            int lastDigitToThePowerOfNoOfDigits = 1;
            for(int i = 0; i < noOfDigits; i++)
            {
                lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
            }
            sum = sum + lastDigitToThePowerOfNoOfDigits;
            copyOfNumber = copyOfNumber / 10;
        }
        if (sum == number)
        {
            numberStatus = true;
            System.out.println(number+" is an armstrong number");
        }
        else
        {
            numberStatus = false;
            System.out.println(number+" is not an armstrong number");
        }
        return numberStatus;
    }
    private static long bullishRise(long factNumber){
        System.out.println("Number = "+ factNumber);
        long resFactNumber = 1;
        long product = 1;
        long factNumberCube = factNumber * factNumber * factNumber;
        System.out.println("Cube = "+ factNumberCube);
        for(long i=1;i<=factNumberCube;i++){
             product =product*i;
            System.out.println("Cube Factorial = "+ product);
        }

        resFactNumber = product;
        return resFactNumber;
    }
    private static boolean flutterUp(boolean iamstrong, long bulled){
        boolean eveness = false;
        if (iamstrong){
           if(bulled%2 == 0){
               eveness = true;
           }else {
               eveness = false;
           }
        }
        return eveness;
    }
}
