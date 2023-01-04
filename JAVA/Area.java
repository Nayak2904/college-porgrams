public class Area {
    double areaOfCicle(double r){
        return 3.14*r*r;
    }
    double perimeterOfCircle(double redius){
        return 2*3.14*redius;
    }

    int areaOfRectangle(int l, int b){
        return l*b;
    }
    int perimeterOfRectangle(int l, int b){
        return 2*(l+b);
    }

    public static void main(String[] args) {
        Area obj = new Area();
        double peri = obj.perimeterOfCircle(5f);
        double are = obj.areaOfCicle(5f);
        int per = obj.perimeterOfRectangle(10, 20);
        int ar = obj.areaOfRectangle(10,20);
        System.out.println("Perimeter of circle is:"+peri);
        System.out.println("Area of circle is:"+are);
        System.out.println("Perimeter of rectangle is:"+per);
        System.out.println("Area of rectangle is:"+ar);
    }
}
