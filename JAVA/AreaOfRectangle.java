import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("To find the area of a rectangle ");
        System.out.println("Enter Length of the rectangle: ");
        int l = sc.nextInt();

        System.out.println("Enter breadth of the rectangle: ");
        int b = sc.nextInt();

        System.out.println("Area= " +l*b);
    }
}
