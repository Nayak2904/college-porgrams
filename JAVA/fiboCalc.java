import java.net.StandardSocketOptions;
import java.util.Scanner;

public class fiboCalc {
    public static int fibo_rec(int n){
        if (n==0) {
            return 0;
        }
        if (n==1 || n==2) {
            return 1;
        }
        return fibo_rec(n-2) + fibo_rec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your limit:");
        int num = sc.nextInt();

        System.out.println("Fibonacci series of "+num+" numbers is: ");
        for (int i = 0; i <= num; i++) {
            System.out.print(" "+fibo_rec(i));
        }
    }
}
