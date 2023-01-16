
public class Q2 {
    public static void main(String[] args) {
        String text = "To my      Friend";
        text = text.replace(" ", "_");
        System.out.println(text);

        // Q3:
        String letter = "Dear _, Thanks a lot!";
        letter = letter.replace("_", "Shivajee");
        System.out.println(letter);

        // Q4:
        String myString = "  Th   is string contains double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
    }
}
