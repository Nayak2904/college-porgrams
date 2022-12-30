
public class Q1 {
    public static void main(String[] args) {
        int a = 10;

        // This will through an error::
        // if (a = 11) {
        // System.out.println("I am 11.");
        // } else {
        // System.out.println("I am not 11.");
        // }

        // Correct way to write this program is:

        if (a == 11) {
            System.out.println("I am 11.");
        } else {
            System.out.println("I am not 11.");
        }
    }
}
