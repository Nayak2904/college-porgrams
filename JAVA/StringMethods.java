import java.util.Scanner;

import javax.lang.model.type.NoType;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(":::String Methods:::\n");
        String name = sc.next();
        System.out.println("Length of the String is: "+ name.length());

        System.out.println("\nMake String to LowerCase: "+name.toLowerCase());

        System.out.println("\nMake String to UpperCase: "+name.toUpperCase());
        System.out.println("\n TRIMMING");
        String beforeTrime = "    Nayak    ";
        System.out.println("Before trim: "+beforeTrime);
        System.out.println("After trim: "+beforeTrime.trim());

        System.out.println("\nStarting a string from index number:3");
        System.out.println("Substring: "+name.substring(3));
        System.out.println("\nStarting a string from an index number:2, and ending that string at index:3");
        System.out.println("Substring with starting point and ending point: "+name.substring(2,3));

        System.out.println("\nReplace: "+name.replace('i','p'));

        System.out.println("\nString Starts with \"Sh\" ");
        System.out.println(name.startsWith("Sh"));

        System.out.println("\nString Ends with \"va\"");
        System.out.println(name.endsWith("va"));

        System.out.println("\nCharacter at index number 3");
        System.out.println(name.charAt(3));

        System.out.println("\nIndex of char \'i\' is");
        System.out.println(name.indexOf('i'));

        System.out.println("\nIs the string equals to \"Shiva\"?");
        System.out.println(name.equals("Shiva"));

        System.out.println("\nIs the string equals to \"ShIvA\"? (ignore the case)");
        System.out.println(name.equalsIgnoreCase("ShIvA"));
    }
}
