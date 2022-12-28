import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        boolean flag = false;
        int num = sc.nextInt();
        for (int i = 2; i < num/2; i++) {
            if (num % 1 == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println(num +" is a prime number");
        } else {
            System.out.println(num+" is not a parime number");
        }
        
    }
}
