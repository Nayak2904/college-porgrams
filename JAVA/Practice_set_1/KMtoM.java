import java.util.Scanner;

public class KMtoM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("::Length Calculator::");
        System.out.print("Enter length in KM:");
        float km = sc.nextFloat();

        float mi = km * 0.62f;
        System.out.println(km + " Kilometer is = " + mi + " Mile ");
    }
}
