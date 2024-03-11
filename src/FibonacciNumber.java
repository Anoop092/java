import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args){
//        Program for finding the number in nth fibonacci series
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int sum =0;
        for (int i =2;i<=num;i++){
             sum = a+b;
             a=b;
             b=sum;

        }
        System.out.println("The fibonancci number: " + sum);
    }
}
