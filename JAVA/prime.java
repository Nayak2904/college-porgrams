import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    System.out.println("ENter a number to check: ");
        int num = sc.nextInt();
        boolean flag = false;
        for(int i = 2; i<= num/2;++i){
            //condition for non prime number
            if (num % 1 == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) 
            System.out.println(num+ " is a prime number.");
        
        else
            System.out.println(num+ " is not a prime number.");
        
    }
}
