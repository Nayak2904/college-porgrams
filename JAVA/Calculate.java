import java.util.Scanner;



//Method Overloading::::
// public class Calculate {
//     int multiply(int a, int b){
//         return a*b;
//     }
//     double multiply(double a, double b){
//         return a*b;
//     }
//     public static void main(String[] args) {
//         Calculate obj = new Calculate();
//         int c = obj.multiply(10, 15);
//         double d = obj.multiply(10.4f, 15.5f);
//         System.out.println("Multiply method : returns Integer:"+c);
//         System.out.println("Multiply method : returns Double:"+d);

//     }
// }
// Method Overriding:::::
/**
 * Calculate
 */
public class Calculate {

    int perimeter(int l, int b){
        
        return 4*l;
    }
    double perimeter(double l, double b){
        return 2*(l+b);
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in)
        Calculate obj = new Calculate();
        int s = obj.perimeter(5, 5);
        double r = obj.perimeter(12.5f, 5.5f);
        System.out.println("Perimeter of this square is: "+s);
        System.out.println("Perimeter of this rectangle is: "+r);
        // System.out.println("Enter the length and berath respectively: ");
        // int sq = sc.nextInt();
        // sq = obj.perimeter();
    }
}