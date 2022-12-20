import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse it:");
        int num=sc.nextInt();
        int rev=0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev*10+rem;
            num /= 10;
        }
        System.out.println("Reversed number is: "+ rev);
    }
}
