class India{
    public void Country(){
        System.out.print("India -> ");
    }
}
class State extends India{
    public void State(){
        System.out.print("Odisha -> ");
    }
}
class Dist extends State{
    public void Dist(){
        System.out.print("Bolangir \n");
    }
}
class State2 extends India{
    public void State2(){
        System.out.print("Tamilnadu -> ");
    }
}
class Dist2 extends State2{
    public void Dist2(){
        System.out.print("Chennai  ");
    }
}

public class HirInheritance {
    public static void main(String[] args) {
        India i = new India();
        
        State s = new State();
        s.Country();
        s.State();
        Dist d = new Dist();
        d.Dist();
        State2 s2 = new State2();
        s2.Country();
        s2.State2();
        Dist2 d2 = new Dist2();
        d2.Dist2();
    }
}
