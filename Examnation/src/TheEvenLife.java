import java.util.Scanner;

/**
 * Created by Daveola on 05-Apr-17.
 * A Java CLI program that determines if a set of numbers contains even numbers
 * A separate method also counts the number of even numbers and displays this count
 * CSC 301 - 2016-2017 Session Uniosun (Osun State University)
 */
public class TheEvenLife {


    public static  void main(String args[]){

        int n =3;
        int arrayNum[];
        arrayNum = new int[3];
        for (int cnt =0; cnt <=2; cnt++){
            System.out.print("Enter number " + (cnt+1) +" : ");
            Scanner inout = new Scanner(System.in);
            arrayNum[cnt] = inout.nextInt();
        }
        boolean testresult = testThreeEven(arrayNum[0], arrayNum[1], arrayNum[2]);
        System.out.println(" ******* FIRST Method *****");
        if(testresult){
            System.out.println("There is an even number");
        }else {
            System.out.println("There is NO even number");
        }


        System.out.println(" ******* SECOND Method *****");

        int testCount = countEvens(testresult, arrayNum[0], arrayNum[1], arrayNum[2]);
        if (testCount==1){
            System.out.println("The number of even numbers is " + testCount);
        }else{
            System.out.println("The number of even numbers are " + testCount);
        }


    }


    public  static int countEvens(boolean testresult, int a, int b, int c){
        int cnt = 0;
        if (testresult){

            if (a%2 == 0){
                cnt++;
            }if (b%2 == 0){
                cnt++;
            }if (c%2 == 0){
                cnt++;
            }

            return cnt;

        }else {
            System.out.println("There were no even numbers");
            return cnt;
        }
    }


    public static boolean testThreeEven(int a, int b, int c){
        boolean testEven = false;
        if(a%2 == 0 || b%2 == 0 || c%2 == 0){
            testEven = true;
            return testEven;
        }else{
            return testEven;

        }

    }
}
