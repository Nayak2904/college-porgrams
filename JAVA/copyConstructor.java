/**
 * copyConstructor
 */
public class copyConstructor {

    int id;
    String name;
    copyConstructor(int i, String n){
        id = i;
        name = n;
    }
    copyConstructor(copyConstructor s){
        id = s.id;
        name = s.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        copyConstructor s1 = new copyConstructor(20,"Shiva");
        copyConstructor s2 = new copyConstructor(s1);
        s1.display();
        s2.display();
    }
}