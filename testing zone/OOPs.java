import java.util.Scanner;
class Employee{
    int id;
    String name;
}
public class OOPs {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee shiva = new Employee();
        shiva.id = 179;
        shiva.name = "Shiva";
        System.out.println(shiva.id);
        System.out.println(shiva.name);
    }
}
