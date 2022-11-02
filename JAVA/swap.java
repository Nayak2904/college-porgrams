public class swap {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 15;
        System.out.println("--Before Swap--");
        System.out.println("num1: " +n1);
        System.out.println("num2: " +n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("--After swap--");
        System.out.println("num1: "+n1);
        System.out.println("num2: "+n2);

    }
}
