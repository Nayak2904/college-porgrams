import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 46;
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        if (n < num) {
            System.out.println(n + " is less than " + num);
        }
        if (n > num) {
            System.out.println(n + " is greater than " + num);

        }
    }
}
