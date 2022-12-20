import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=0,n2=1,n3,i;
        System.out.print("Enter your range:");
        int count=sc.nextInt();
        System.out.println("Fibonacci series of your given range is:");
        System.out.println(n2);
        for(i=2;i<count;++i){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
