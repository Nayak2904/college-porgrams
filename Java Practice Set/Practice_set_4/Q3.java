import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tax = 0;
        System.out.println("Enter your income in lakhs per anum:");
        float income = sc.nextFloat();
        if (income <= 2.5f) {
            tax = tax + 0;
        } else if (income > 2.5f && income < 5.0f) {
            tax = tax + 0.5f * (income - 2.5f);

        } else if (income > 5f && income < 10f) {
            tax = tax + 0.5f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        } else if (income < 10f) {
            tax = tax + 0.5f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 5.0f);
        }
        System.out.println("The total tax paid by the employee is:" + tax);
    }
}
