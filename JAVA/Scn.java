import java.util.Scanner;

public class Scn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.next();

        System.out.println("Enter your roll. no.: ");
        int roll = sc.nextInt();

        System.out.println("Enter your marks:");
        int marks = sc.nextInt();

        System.out.println("\n");

        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+roll);
        System.out.println("Mark: "+marks);

    }
}
