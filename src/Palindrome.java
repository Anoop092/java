public class Palindrome {
    public static void main(String[] args) {
        int n = 122;
        if (isPalindrome(n)){
            System.out.println("The given number is palindrome");
        }else{
            System.out.println("The given number is not palindrome");
        }
    }
    static boolean isPalindrome(int n){
        int intialNumber = n;
        int finalNumber =0;
        while (n>0){
            int rem = n%10;
            finalNumber = finalNumber *10 + rem;
            n = n/10;
        }
        return  intialNumber == finalNumber;
    }
}
