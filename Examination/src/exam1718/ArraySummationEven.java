package exam1718;

public class ArraySummationEven {
    public static void main(String args[]){
        int sum = 0;
        int  arrayNum[] ={4, 5, 60, 8, 6, 7, 20, 10, 2, 15};
        for(int i=0; i<=arrayNum.length-1; i++){
            sum += arrayNum[i];
        }
        boolean evenSum = evenness(sum);
        if (evenSum){
            System.out.println("The array's sum is even");
        }else {
            System.out.println("The array's sum is odd");
        }
    }

    private static boolean evenness(int num){
        boolean evenness = false;
        if(num%2==0){
            evenness = true;
        }else {
            evenness = false;
        }
        return evenness;
    }
}
