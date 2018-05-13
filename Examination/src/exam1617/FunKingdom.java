package exam1617;

import java.util.Scanner;

/**
 * Created by Daveola on 08-Apr-17.
 */
public class FunKingdom {



    public static void main(String args[]){


        System.out.println("METHOD: funMatrix");
        System.out.print("Enter the first number a: ");
        Scanner inout = new Scanner(System.in);
        int a = inout.nextInt();
        System.out.print("Enter the first number b: ");
        inout = new Scanner(System.in);
        int b = inout.nextInt();
        System.out.print("Enter the first number c: ");
        inout = new Scanner(System.in);
        int c = inout.nextInt();
        System.out.print("Enter the first number d: ");
        inout = new Scanner(System.in);
        int d = inout.nextInt();
        System.out.print("Enter the first number e: ");
        inout = new Scanner(System.in);
        int e = inout.nextInt();

        boolean statusresult = funMatrix(a, b,c,d,e);
        System.out.println("Value of status: " + statusresult);


        System.out.println("METHOD: idoutMatrix");
        System.out.print("Enter the first number x: ");
        inout = new Scanner(System.in);
        int x = inout.nextInt();
        System.out.print("Enter the first number y: ");
        inout = new Scanner(System.in);
        int y = inout.nextInt();
        idoutMatrix(x,y);

    }


    public static boolean funMatrix(double a,double b,double c,double d,double e) {
        boolean status = false;
        double averageNum = (a+b+c+d+e)/5;
        double sumNum = a+b+c+d+e;
        //if the average is greater than the sum of the 5 numbers.
        if(averageNum > sumNum){
            status = true;
        }
        return status;
    }

    public  static  int idoutMatrix(int a, int b){
        int differenceNum = a - b;
        System.out.println("Difference between parameters is: " + differenceNum);
        int sumNum = a + b;
        System.out.println("Sum of parameters is: " + sumNum);
        int productDiffSum = differenceNum * sumNum;
        System.out.println("Product of parameters sum and difference is: " + productDiffSum);
        return productDiffSum;
    }
}
