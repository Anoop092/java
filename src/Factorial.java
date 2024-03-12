public class Factorial {
    public static void main(String[] args) {
        // program to find out factorial of given number
        System.out.println(findFactorial(5));

    }
    static int findFactorial(int n){
        int ans =1;
        while(n>=1){
            ans = ans * n;
            n--;
        }
        return ans;
    }
}
