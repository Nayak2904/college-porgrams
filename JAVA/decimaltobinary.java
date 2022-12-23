import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to convert it into Binary: ");
        int num = sc.nextInt();
        
        System.out.println("Binary form of "+num +" is "+Integer.toBinaryString(num));
        // System.out.println(Integer.toBinaryString(num));
        // System.out.println(Integer.toBinaryString(num));
    }
}
