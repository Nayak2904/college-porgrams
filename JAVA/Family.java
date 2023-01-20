
class GrandFather{
    public void display(){
     
        System.out.print("Grand Father -> ");
        
    }
}
class Father extends GrandFather{
    
    public void Father(){
        
        System.out.print("Father -> ");
        
    }
    
}
class Child extends Father{
    
    public void Child(){
        
        System.out.print("Me");
       
    }
    
}
public class Family {
    public static void main(String[] args) {
        
        GrandFather g = new GrandFather();
        g.display();
        Father f = new Father();
        f.Father();
        Child c = new Child();
        c.Child();
        System.out.println("\nWe Are Family!!!");
    }
}
