import java.util.Scanner;

public class UserSum {
    public static void main(String[] args) {
        System.out.println("Taking input from user:");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number: ");      
        int n1 = s.nextInt();
        System.out.println("Enter 2nd number: ");
        int n2 = s.nextInt();
        int sum = n1 + n2;
        System.out.println("The sum of these numbers is: ");
        System.out.println(sum);
    }
}
