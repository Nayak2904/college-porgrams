import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gcd = 1;
        System.out.println("Enter two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        for (int i = 1; i <=n1 && i<=n2; ++i) {
            if (n1%i==0 && n2%i==0) {
                gcd = i;
            }
        }
        int lcm = (n1*n2)/gcd;
        System.out.println("GCD of given number is:"+gcd);
        System.out.println("LCM of given number is:"+lcm);
    }
}
