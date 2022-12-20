import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        System.out.println("Enter the marks of the Student in particular subjects:-");
        Scanner mrk = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects: ");
        float sub_1 = mrk.nextFloat();
        float sub_2 = mrk.nextFloat();
        float sub_3 = mrk.nextFloat();
        float sub_4 = mrk.nextFloat();
        float sub_5 = mrk.nextFloat();

        float total;
        float avg;
        float percentage;
      

        total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
        avg = (float) (total / 5.0);
        percentage = (float)((total / 500.0)*100);

       

        System.out.println("\nThe total marks = " + total + "/500.0");
        System.out.println("The Avarage marks = " + avg);
        System.out.println("The Percentage = " + percentage + "%");
        
    }
}
