import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name in lowercase:");
        String name = sc.next();

        System.out.println("Your name in uppercase:-" + name.toUpperCase());

    }
}
