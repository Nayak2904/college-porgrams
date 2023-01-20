class Base{
    int roll;
    public int getRoll() {
        return roll;
    }
    public void setRoll( int r){
        this.roll=r;
    }
    
}
class Child extends Base{
    public int marks;
    public int getMarks(){
        return marks;

    }
    public int setMarks(int m){
        this.marks = m;
        return marks;
        }
    
}

public class inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setRoll(179);
        System.out.println("Roll No.:"+ b.getRoll());
        Child g = new Child();
        g.setMarks(80);
        System.out.println("Mark:"+ g.getMarks());
    }
}
