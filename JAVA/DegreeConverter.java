import java.util.Scanner;

/**
 * DegreeConverter
 */
public class DegreeConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice: \n1.Farenheit to Celcius:\n 2.Celcius to Farenheit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            System.out.println("Enter temperature in Farenheit:");
            float f = sc.nextFloat();

            float c = ((f-32)*5)/9;
            System.out.println("Temperature in Celcius = "+c);
                break;

            case 2:
            System.out.println("Enter temperature in Celcius:");
            float Cel = sc.nextFloat();

            float far = (Cel*9/5)+32;
            System.out.println("Temperature in Farenheit = "+far);
            break;
               
        
            default:
            System.out.println("Wrong input!!!");
                break;
        }
        // System.out.println("");



        
    }
}