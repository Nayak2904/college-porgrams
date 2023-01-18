import java.util.Scanner;

class Product{
    int pro_id;
    String brand;
    Product( int pid, String n){
        pro_id = pid;
        brand = n;
    }
    public void display(){
        System.out.println("Product id="+pro_id+ " " +"Product name="+brand);
        // sc.nextInt();
    }
}
// class Product{
//     int number;
//     String Brand;
// }
public class ArrayOfObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] obj = new Product[5];
        sc.nextInt();
        obj[] = new Product(sc.nextInt());
       
        // obj[1] = new Product(12345, "HP");
        // obj[2] = new Product(12346, "LG");
        // obj[3] = new Product(12347, "Samsung");
        // obj[4] = new Product(12344, "Asus");

        // System.out.println("Product object1 1:" );
        // obj[0].display();
        // System.out.println("Product object1 2:" );
        // obj[0].display();
        // System.out.println("Product object1 3:" );
        // obj[0].display();
        // System.out.println("Product object1 4:");
        // obj[0].display();
        // System.out.println("Product object1 5:" );
        // obj[0].display();

    }
    
}
