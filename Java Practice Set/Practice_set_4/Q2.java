import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks here.");

        System.out.print("marks in sub1:");
        int n1 = sc.nextInt();

        System.out.print("marks in sub2:");
        int n2 = sc.nextInt();

        System.out.print("marks in sub3:");
        int n3 = sc.nextInt();

        System.out.println(" ");

        int total = n1 + n2 + n3;
        System.out.println("Total:" + total);

        float avg = total / 3;
        System.out.println("Agrerage:" + avg + "%");

        float per = (total / 300f) * 100f;
        System.out.println("Prcentage:" + per);

        if (per <= 33) {
            System.out.println("Your failed, study harder!!");
        } else {
            System.out.println("You have passed this examination!!");
        }
    }
}
