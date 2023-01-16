import java.util.Scanner;

public class CheckInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            System.out.println(sc.hasNextInt() + " is a valid integer.");
        } else {
            System.out.println(sc.hasNextInt() + " is not a valid integer.");
        }
    }
}
