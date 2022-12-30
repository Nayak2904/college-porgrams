import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".com")) {
            System.out.println("This is a commercial website.");
        }
        if (website.endsWith(".in")) {
            System.out.println("This is a Indian website.");
        }
        if (website.endsWith(".org")) {
            System.out.println("This is a organizational website.");
        }
    }
}
