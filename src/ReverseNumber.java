import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        // Reverse the given number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        // take input from user
        int number = input.nextInt();
        int reverse = 0;
        while (number>0){
            int rem = number%10;
            reverse = reverse*10 + rem;
            number = number/10;
        }
        System.out.println("Reversed number is: " + reverse);

    }
}
