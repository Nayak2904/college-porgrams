import java.util.Scanner;
import java.util.Random;

public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        //Taking computer input.
        int Comp_Choice = rand.nextInt(3);
        
        System.out.println("0-->Rock\n 1-->Paper\n 2-->Scissors\n");
        System.out.println("What do you choose:\t");
        int user_choice = sc.nextInt();//taking input from user.

        //game logic.
        System.out.printf("You chose %d\n", user_choice);
        System.out.printf("Computer chose %d\n", Comp_Choice);

        if (Comp_Choice==user_choice) {
            System.out.println("Its a draw");
        }
        else if(Comp_Choice==0){
            if (user_choice==1) {
                System.out.println("You Won!!!");
            }else if(user_choice==2){
                System.out.println("Computer Won :(");
            }
        }else if (Comp_Choice==1) {
            if (user_choice==0) {
                System.out.println("Computer Won :(");
            }else if (user_choice==2) {
                System.out.println("You Won!!!");
            }
        }else if (Comp_Choice==2) {
            if (user_choice==0) {
                System.out.println("You Won!!!");
            }else if (user_choice==1) {
                System.out.println("Computer Won :(");
            }
        }
    }
}
