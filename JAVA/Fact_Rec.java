import java.util.Scanner;

/**
 * Fact_Rec
 */
public class Fact_Rec {

    static int factorial(int n){
        if (n==0) {
            return 1;
        } else {
            return (n*factorial(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter a number to find its Factorial: ");
        int num = sc.nextInt();
        
        fact = factorial(num);

        System.out.println("Factorial of "+num+" is "+fact);

    }
}