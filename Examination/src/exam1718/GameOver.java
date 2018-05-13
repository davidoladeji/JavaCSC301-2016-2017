package exam1718;
import java.util.Random;
public class GameOver {
    public static void main(String args[]){
        String numberStatus = gameOver(2, 10);
        System.out.println(numberStatus);
    }
    private static String gameOver(int low, int high){
        String outputString;
            Random rand  = new Random();
            int ourRandom = rand.nextInt(high-low+1)+low;
        int factors = 0;
        int j = 1;
        while(j <= ourRandom)
        {
            if(ourRandom % j == 0){
                factors++;
            }
            j++;
        }
        if (factors == 2) {
           // System.out.println(ourRandom+": prime number");
            outputString = ourRandom+": prime number: ";
        }else {
            //System.out.println(ourRandom + ": not prime number");
            outputString = ourRandom + ": not prime number: ";
        }
        return outputString;
    }
}
