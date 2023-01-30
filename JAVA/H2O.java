interface Hydrogen{
    void mixWithHyd();
}
interface Oxygen{
    void mixWithOxy();
}
class Water implements Hydrogen,Oxygen{
    public void mixWithHyd(){
        System.out.print("H2 + ");
    }
    public void mixWithOxy(){
        System.out.print("O2 = ");
    }
    void mixUp(){
        System.out.print("H2O");
    }
}

public class H2O {
    public static void main(String[] args) {
        Water w = new Water();
        w.mixWithHyd();
        w.mixWithOxy();
        w.mixUp();

    }
}

