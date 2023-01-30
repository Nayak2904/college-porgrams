import java.util.Scanner;

public class RevNum {

    public static int revWhile(int n){
        int rev = 0;
        while (n != 0) {
            int rem = n %10;
            rev = rev*10+rem;
            n /= 10;
        }
        return rev;
        
    }
    public static int revFor(int number){
            for (int i = 0; i <= number; i++) {
                int rem = number%10;
                i = i*10+rem;
                number /= 10;
            }
        return number;
    }
    public static void reverse(int num){
        if (num < 10){
            System.out.println(num);
            return;
        }
        else{
            System.out.println(num % 10);
            reverse( num * 10);
        }
    }
  
    
    
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = r.nextInt();
        // System.out.println("(While)Reversed number is: "+revWhile(n));
        System.out.print("(For)Reversed number is: "+revFor(n));
        // System.out.print("(Recursion)Reversed number is: "+reverse(n));
    } 
}
