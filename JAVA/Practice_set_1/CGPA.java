//Progra to calculate CGPA:

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your grade points");

        System.out.print("Enter your grade points in subject 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter your grade points in subject 2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter your grade points in subject 3: ");
        int n3 = sc.nextInt();
        System.out.print("Enter your grade points in subject 4: ");
        int n4 = sc.nextInt();
        System.out.print("Enter your grade points in subject 5: ");
        int n5 = sc.nextInt();

        int total = n1 + n2 + n3 + n4 + n5;
        System.out.println("Total grade points: " + total);

        float cgpa = total / 5;
        System.out.print("Your CGPA is:" + cgpa);
    }
}
