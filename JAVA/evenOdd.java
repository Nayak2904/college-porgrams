import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");        
        int num = reader.nextInt();
        if (num%2 == 0) {
            System.out.println("Entered number is even");
        }
        else{
            System.out.println("Enterd number is odd");
        }
    }
}
