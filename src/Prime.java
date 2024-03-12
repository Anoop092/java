import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        int n = input();
        if(isPrime(n)){
            System.out.println("Yes, the given number is prime");
        }else{
            System.out.println("The given number is not prime");
        }
    }
    static int input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt();
        return number;
    }
    static boolean isPrime(int n){
        if(n<=1){
            return true;
        }
        int c =2;
        while(c*c<=n){
            if (n%c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;

    }
}
